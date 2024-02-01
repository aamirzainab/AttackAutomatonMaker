import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileReader;
import org.apache.commons.lang3.Range;

import dk.brics.automaton.*;
import org.apache.commons.lang3.tuple.Pair;
public class AutomatonMaker {
    public static void main(String[] args){
        String filePath = "/Users/zainabaamir/Desktop/Research/RegexSL/RegexAnalyzer/checker.json";
        String line ;
        JSONParser myParser = new JSONParser();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                try {
                    Object obj ;
                    obj = myParser.parse(line);
                    JSONObject jsonObject = (JSONObject) obj;
//                    String reg = (String)  jsonObject.get("pattern");
                    String reg = "(.*):([^.]*)";
                    String unescapedRegex = reg;
                    RegExp re =  new RegExp(reg, 0);
                    Automaton a = re.toAutomaton(false);
                    System.out.println("This is the automaton  \n " + a.toDot());
                    Pair<List<List<String>>, List<Automaton>> slAnswers = slregex(unescapedRegex, a);
                    Pair<List<List<String>>, List<Automaton>> expAnswers = expregex(a,unescapedRegex);
                    Automaton resultAutomatonSL = new Automaton();
                    Automaton resultAutomatonExp = new Automaton();
                    List<Automaton> slAutomatons = slAnswers.getRight();
                    List<Automaton> expAutomatons = expAnswers.getRight();
                    if (expAutomatons.size() != 0) {
                        resultAutomatonExp = expAutomatons.get(0).union(expAutomatons);
                        resultAutomatonExp.minimize();
                        resultAutomatonExp.reduce();
                        System.out.println("This is the result exp automaton   \n" + resultAutomatonExp.toDot());
                        AutomatonPaths pathObj = new AutomatonPaths();
                        Map<Set<State>, AutomatonPaths.PathDetail> details = pathObj.computePathsDetails(resultAutomatonExp);
                        for (Map.Entry<Set<State>, AutomatonPaths.PathDetail> entry : details.entrySet()) {
                            String pathStr = entry.getKey().stream()
                                    .map(s -> "s" + s.getNumber())
                                    .collect(Collectors.joining("->"));
//                            System.out.println("Path: " + pathStr + " -> Length: " + entry.getValue());
//                            System.out.println(entry.getValue().toFormattedStringEquation() + " , " );
                            int k = entry.getKey().size();
                            int gcf = AutomatonPaths.computeGCF(entry.getValue());
//                          System.out.print(gcf + " , ");
//                            if (AutomatonPaths.hasNonAcceptingDestination(entry.getValue())) { System.out.print(" yes "); }
//                            else { System.out.print("no"); }
                        }
                        System.out.println();
                    }
                    else {
                        if (slAutomatons.size() != 0) {
                            resultAutomatonSL = slAutomatons.get(0).union(slAutomatons);
                            resultAutomatonSL.minimize();
                            resultAutomatonSL.reduce();
                            System.out.println("This is the result super-linear automaton   \n" + resultAutomatonSL.toDot());
                            AutomatonPaths pathObj = new AutomatonPaths();
                            Map<Set<State>, AutomatonPaths.PathDetail> details = pathObj.computePathsDetails(resultAutomatonSL);
                            for (Map.Entry<Set<State>, AutomatonPaths.PathDetail> entry : details.entrySet()) {
                                String pathStr = entry.getKey().stream()
                                        .map(s -> "s" + s.getNumber())
                                        .collect(Collectors.joining("->"));
//                                System.out.println("Path: " + pathStr + " -> Length: " + entry.getValue().toFormattedStringEquation());
                                System.out.print(entry.getValue().toFormattedStringEquation() + " , " );
                                int k = entry.getKey().size();
                                int gcf = AutomatonPaths.computeGCF(entry.getValue());
//                                System.out.print(gcf + " , ");
//                                if (AutomatonPaths.hasNonAcceptingDestination(entry.getValue())) { System.out.print(" yes "); }
//                                else { System.out.print(" no "); }
                            }
                            System.out.println();
                        }
                    }

                }
                catch(Exception e){
                    System.out.println("ERROR inner:  " + e);
                }
            }
        }
        catch (Exception e) {
            System.out.println("ERROR outer " + e);
        }

    }

    static Pair<List<List<String>>, List<Automaton>> expregex(Automaton automaton, String regex) {
        List<List<String>> attackInputs = new ArrayList<>();
        List<String> pumps = new ArrayList<>();
        List<Automaton> attackAutomatons = new ArrayList<>();
        Pair<String,Automaton> nullPair = Pair.of(null,null);
        for (State currentState : automaton.getStates()) {
            for (Transition t1 : currentState.getTransitions()) {
                for (Transition t2 : currentState.getTransitions()) {
                    if (!t1.equals(t2)) {
                        Pair<String,Automaton> val = nullPair;
                        boolean rangeCheck = Math.max(t1.getMin(), t2.getMin()) <= Math.min(t1.getMax(), t2.getMax());
                        boolean overlap = t1.isEpsilon() || t2.isEpsilon() || rangeCheck ;
                        if (!overlap) { val = nullPair ; }
                        else {
                            Automaton a1 = createAutomaton(automaton, t1.getDest(), Set.of(currentState), null);
                            State qStar = new State();
                            qStar.addTransition(giveTransition(a1.getInitialState(), t1)); ;
                            a1.getStates().add(qStar);
                            a1.setInitialState(qStar);
                            Automaton a2 = createAutomaton(automaton, t2.getDest(), Set.of(currentState), null);
                            State qStar1 = new State();
                            qStar1.addTransition(giveTransition(a2.getInitialState(), t2)); ;
                            a2.getStates().add(qStar1);
                            a2.setInitialState(qStar1);
                            if (a1.getShortestExample(true) != null && a2.getShortestExample(true) != null )
                            {
                                a1.removeDeadTransitions();
                                a2.removeDeadTransitions();
                                val = Pair.of((a1.intersection(a2)).getShortestExample(true), a1.intersection(a2));
                            }
                        }
                        if (!val.equals(nullPair) ) {
                            String pump = val.getLeft();
                            Automaton attack = val.getRight();
                            if (!pumps.contains(pump) && pump != null) {
                                Pair<Automaton, Automaton> prefixAndSuffixAutomatons = createPrefixAndSuffixAutomaton(automaton, currentState, currentState);
                                String prefix = prefixAndSuffixAutomatons.getLeft().getShortestExample(true);
                                String suffix = prefixAndSuffixAutomatons.getRight().complement().getShortestExample(true);
                                List<String> evilInput = new ArrayList<>();
                                attackAutomatons.add(attack);
                                pumps.add(pump);
                                evilInput.add(prefix);
                                evilInput.add(pump);
                                evilInput.add(suffix);
                                attackInputs.add(evilInput);
                            }
                        }
                    }
                }
            }
        }
        return Pair.of(attackInputs, attackAutomatons);
    }

    static Pair<List<List<String>>, List<Automaton>> slregex(String pattern, Automaton automaton) {
        List<List<String>> attackInputs = new ArrayList<>();
        List<Automaton> attackAutomatons = new ArrayList<>();
        Set<State> backEdge = new HashSet<>();
        Pair<String,Automaton> nullPair = Pair.of(null,null);
        List<String> checker = new ArrayList<>();
        for (State currentState : automaton.getStates()) {
            if (currentState.getTransitions().size() < 2 ) continue ;
            if (backEdge.contains(currentState)) continue;
            for (Transition currTransition : currentState.getTransitions()) {
                for (State finalState : automaton.getStates()) {
                    if (currentState.equals(finalState)) continue ;
                    if (backEdge.contains(finalState)) continue;
                    Pair<String, Automaton> pumpObj = findSLPump(automaton, currentState, finalState, currTransition, backEdge);
                    if (!pumpObj.equals(nullPair) && !checker.contains(pumpObj.getLeft())) {
                        String pump = pumpObj.getLeft();
                        checker.add(pump);
                        Automaton attackAutomaton = pumpObj.getRight();
                        if (attackAutomaton != null )
                        {
                            System.out.println("States involved: s" + currentState.getNumber() + " and s" + finalState.getNumber());
                            Pair<Automaton,Automaton> prefixAndSuffixAutomatons = createPrefixAndSuffixAutomaton(automaton,currentState,finalState);
                            String prefix = prefixAndSuffixAutomatons.getLeft().getShortestExample(true);
                            String suffix = prefixAndSuffixAutomatons.getRight().complement().getShortestExample(true);
//                            System.out.println("Attack automaton with pump " + pump + ":\n" + attackAutomaton.toDot());
//                            System.out.println("Prefix automaton \n" + prefixAndSuffixAutomatons.getLeft().toDot());
//                            System.out.println("Suffix automaton \n" + prefixAndSuffixAutomatons.getRight().toDot());
                            List<String> attackInput = Arrays.asList(prefix, pump, suffix);
                            attackInputs.add(attackInput);
                            attackAutomatons.add(attackAutomaton);
                        }

                    }
                }
            }
        }
        return Pair.of(attackInputs, attackAutomatons);
    }

    // naive brute force approach
    public static List<Integer> getPumpLengths(Automaton a){
        List<Integer> primes = Arrays.asList(2,3,5,7,11,13);
        List<Integer> primePump  = new ArrayList<>();
        for (Integer primeNum : primes) {
            if (!(a.getStrings(primeNum)).isEmpty()) {
                primePump.add(primeNum);
            }
        }
        if (primePump.size() > 3){
            return primePump;
        }
        else {
            for (Integer primeNum : primes) {
                for (int i = 1; i <= 11; i++) {
                    if (!(a.getStrings(primeNum*i)).isEmpty()) {
                        continue ;
                    }
                    else {
                        primePump.remove(Integer.valueOf(primeNum));
                    }
                }
            }
            return primePump;
        }
    }
    public static Pair<String, Automaton> findSLPump(Automaton a, State st1, State st2, Transition t, Set<State> backEdge) {
        HashMap<Transition, Transition> mapping = new HashMap();
        Pair<String,Automaton> nullPair = Pair.of(null,null);
        mapping.put(t, null);
        Automaton a2 = createAutomaton(a,st1, Set.of(st2), mapping);
        Transition newExclude =  mapping.get(t);
        State newInitial = new State();
        newInitial.setAccept(a2.getInitialState().isAccept());
        for (Transition t1 : a2.getInitialState().getTransitions()) {
            newInitial = addValidTransition(newInitial,t1,newExclude);
        }
        a2.getStates().add(newInitial);
        a2.setInitialState(newInitial);
        if (a2.getShortestExample(true) == null) {
            return nullPair;
        }
        Automaton a1 = createAutomaton(a, t.getDest(), Set.of(st1),null);
        State qStar = new State();
        qStar.addTransition(t.isEpsilon() ? new Transition(a1.getInitialState()) : new Transition(t.getMin(), t.getMax(), a1.getInitialState()));
        a1.getStates().add(qStar);
        a1.setInitialState(qStar);
        a1.removeDeadTransitions();
        Automaton a3 = createAutomaton(a, st2,Set.of(st2),null);
        qStar = new State();
        for (Transition transition : a3.getInitialState().getTransitions()) {
                Transition newTransition;
                if (transition.isEpsilon()) {
                    newTransition = new Transition(transition.getDest());
                } else {
                    newTransition = new Transition(transition.getMin(), transition.getMax(), transition.getDest());
                }
                qStar.addTransition(newTransition);
            }
            a3.getStates().add(qStar);
            a3.setInitialState(qStar);
            a3.removeDeadTransitions();
            if (a3.getShortestExample(true) == null) {
                backEdge.add(st2);
                return nullPair;
            }
            else
            {
                if (a1.getShortestExample(true) != null && a2.getShortestExample(true) != null &&
                        a3.getShortestExample(true) != null) {
                    a1.reduce();
                    a2.reduce();
                    a3.reduce();
                    Automaton a12 = a1.intersection(a2);
                    a12.reduce();
                    Automaton attack = a12.intersection(a3);
                    attack.reduce();
                    String ex = attack.getShortestExample(true);
                    if (ex == null) {
                        return nullPair;
                    } else {
                        return Pair.of(ex, attack);
                    }
                }
                else { return nullPair; }
            }
    }


    public static Pair<Automaton,Automaton> createPrefixAndSuffixAutomaton(Automaton automaton, State s1,State s2){
        Automaton prefixAutomaton = createAutomaton(automaton, automaton.getInitialState(),  Set.of(s1), null);
        Automaton suffixAutomaton =  createAutomaton(automaton, s1, automaton.getAcceptStates(), (HashMap)null);
        suffixAutomaton.setInitialState(s2);
        suffixAutomaton.removeDeadTransitions();
        return Pair.of(prefixAutomaton,suffixAutomaton);
    }

    public static void removeSelfLoops(State state) {
        Set<Transition> transitionsToRemove = new HashSet<>();
        for (Transition t : state.getTransitions()) {
            if (t.getDest() == state) {
                transitionsToRemove.add(t);
            }
        }
        for (Transition t : transitionsToRemove) {
            state.getTransitions().remove(t);
        }
    }
   //naive approach
    public static State findPrecedingState(Automaton a, State accepting) {
        for (State s : a.getStates()) {
            for (Transition t : s.getTransitions()) {
                if (!s.equals(t.getDest()) && t.getDest().equals(accepting)) {
                    return s;
                }
            }
        }
        return null;
    }


    public static State  addValidTransition(State newInitial, Transition currT, Transition newT) {
        boolean rangeCheck = Math.max(currT.getMin(), newT.getMin()) <= Math.min(currT.getMax(), newT.getMax());
        boolean overlap = currT.isEpsilon() || newT.isEpsilon()|| rangeCheck ;
        if (!currT.equals(newT) && (overlap) ) {
            Transition toAdd;
            if (currT.isEpsilon())
            {
                toAdd = new Transition(currT.getDest());
            }
            else
            {
                toAdd = new Transition(currT.getMin(), currT.getMax(), currT.getDest());
            }
            newInitial.addTransition(toAdd);
        }
        return newInitial ;
    }

    public static Transition giveTransition(State initialState, Transition t1) {
        Transition toAdd  ;
        if (t1.isEpsilon()) { toAdd = new Transition(initialState); }
        else { toAdd = new Transition(t1.getMin(), t1.getMax(), initialState); }
        return toAdd ;
    }


    public static String startAndEnd(String reg){
        if (reg.charAt(0) == '^' ) {
            reg = reg.substring(1);
        }
        if (reg.charAt(reg.length() -1 ) == '$' ) {
            reg = reg.substring(0, reg.length() - 1);
        }
        return reg ;
    }

    public static Automaton createAutomaton(Automaton automaton, State initial, Set<State> accepting, Map<Transition, Transition> mapping) {
        Automaton newAutomaton;
        newAutomaton = automaton.clone();
        Map<State, State> stateMap = new HashMap<>();
        for (State s : automaton.getStates()) {
            stateMap.put(s, new State());
        }
        for (State s : automaton.getStates()) {
            State newState = stateMap.get(s);
            if (accepting.contains(s)) { newState.setAccept(true); }
            if (s.equals(initial)) { newAutomaton.setInitialState(newState) ; }
            for (Transition oldTransition : s.getTransitions()) {
                Transition newTransition ;
                State toState = stateMap.get(oldTransition.getDest());

                if (oldTransition.isEpsilon()) { newTransition = new Transition(toState); }
                else { newTransition = new Transition(oldTransition.getMin(), oldTransition.getMax(), toState); }
                newState.getTransitions().add(newTransition);
                if (mapping != null) {
                    if (mapping.containsKey(oldTransition)) {
                        mapping.put(oldTransition, newTransition);
                    }
                }
            }
        }
        newAutomaton.expandSingleton();
        return newAutomaton;
    }

}

