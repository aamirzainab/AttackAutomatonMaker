import dk.brics.automaton.*;
import java.util.*;
import javafx.util.Pair;
import java.util.stream.Collectors;

public class AutomatonPaths {
    private static final int MAX_PATH_LENGTH = 10;
    public static class PathDetail {
        int length;
        Set<Pair<State, Integer>> loops = new HashSet<>();
        Set<Pair<Set<State>, Integer>> cycles = new HashSet<>();

        public String toFormattedString() {
            List<String> components = new ArrayList<>();
            components.add("k = " + length);
            int count = 1;
            for (Pair<State, Integer> loop : loops) {
                components.add("x" + count + " = " + loop.getValue());
                count++;
            }
            for (Pair<Set<State>, Integer> cycle : cycles) {
                components.add("x" + count + " = " + cycle.getValue());
                count++;
            }
            return String.join(", ", components);
        }

        public String toFormattedStringEquation() {
            List<String> components = new ArrayList<>();
            components.add(String.valueOf(length));
            int count = 1;
            for (Pair<State, Integer> loop : loops) {
                components.add("x" + count + "*(" + loop.getValue() + ")");
                count++;
            }
            for (Pair<Set<State>, Integer> cycle : cycles) {
                components.add("x" + count + "*(" + cycle.getValue() + ")");
                count++;
            }
            return String.join(" + ", components);
        }
        @Override
        public String toString() {
            String loopsStr = loops.stream()
                    .map(loop -> "{s" + loop.getKey().getNumber() + ", " + loop.getValue() + "}")
                    .collect(Collectors.joining(", "));

            String cyclesStr = cycles.stream()
                    .map(cycle -> "{States: [" + cycle.getKey().stream().map(State::getNumber).map(String::valueOf).collect(Collectors.joining(", ")) + "], Length: " + cycle.getValue() + "}")
                    .collect(Collectors.joining(", "));

            return "Length: " + length + ", Loops: [" + loopsStr + "], Cycles: [" + cyclesStr + "]";
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return Math.abs(a);
    }

    public static boolean hasNonAcceptingDestination(PathDetail detail) {
        // Check loops
        for (Pair<State, Integer> loop : detail.loops) {
            if (!loop.getKey().isAccept()) {
                return true;
            }
        }

        // Check cycles
        for (Pair<Set<State>, Integer> cycle : detail.cycles) {
            for (State state : cycle.getKey()) {
                if (!state.isAccept()) {
                    return true;
                }
            }
        }

        return false;
    }


    public static int computeGCF(PathDetail detail) {
        List<Integer> values = new ArrayList<>();
        values.add(detail.length);
        for (Pair<State, Integer> loop : detail.loops) {
            values.add(loop.getValue());
        }
        for (Pair<Set<State>, Integer> cycle : detail.cycles) {
            values.add(cycle.getValue());
        }

        int resultGCF = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            resultGCF = gcd(resultGCF, values.get(i));
        }
        return resultGCF;
    }
    private static boolean hasSelfLoop(State state) {
        for (Transition t : state.getTransitions()) {
            if (t.getDest().equals(state)) {
                return true;
            }
        }
        return false;
    }
    public static void printReachableMultPaths(Map<State, Set<LinkedHashSet<State>>> paths) {
        for (Map.Entry<State, Set<LinkedHashSet<State>>> entry : paths.entrySet()) {
            System.out.println("From state: s" + entry.getKey().getNumber());

            for (LinkedHashSet<State> path : entry.getValue()) {
                String pathStr = path.stream()
                        .map(s -> "s" + s.getNumber())
                        .collect(Collectors.joining("->"));

                System.out.println("  Path: " + pathStr);
            }
        }
    }

    public static Map<State, Set<LinkedHashSet<State>>> getReachableMultPaths(State state) {
        Map<State, Set<LinkedHashSet<State>>> statePaths = new HashMap<>();
        Set<State> visited = new HashSet<>();
        LinkedList<State> worklist = new LinkedList<>();
        statePaths.put(state, new HashSet<>(Arrays.asList(new LinkedHashSet<>(Arrays.asList(state)))));

        worklist.add(state);

        while (!worklist.isEmpty()) {
            State current = worklist.removeFirst();
            for (Transition t : current.getTransitions()) {
                State dest = t.getDest();

                Set<LinkedHashSet<State>> newPaths = new HashSet<>();

                for (LinkedHashSet<State> path : statePaths.getOrDefault(current, Set.of())) {
                    if (path.size() <= MAX_PATH_LENGTH) {
                        LinkedHashSet<State> newPath = new LinkedHashSet<>(path);
                        newPath.add(dest);
                        newPaths.add(newPath);
                    }
                }

                statePaths.putIfAbsent(dest, new HashSet<>());
                statePaths.get(dest).addAll(newPaths);

                if (!visited.contains(dest)) {
                    visited.add(dest);
                    worklist.add(dest);
                }
            }
        }

        statePaths.entrySet().removeIf(entry -> entry.getValue().stream().allMatch(set -> set.size() == 1 && !hasSelfLoop(entry.getKey())));

        return statePaths;
    }
    public static List< Pair<Set<State>, Integer>> detectCycle(Automaton automaton, LinkedHashSet<State> path) {
        List< Pair<Set<State>, Integer>> cycles = new ArrayList<>();
        for (State current : path) {
            Map<State, Set<LinkedHashSet<State>>> reachablePaths = getReachableMultPaths(current);
            if (reachablePaths.keySet().contains(current)) {
                for (LinkedHashSet<State> pathState : reachablePaths.get(current)) {

                    if (pathState.size() != 1 ) {
                        PathDetail detail = new PathDetail();
                        Set<State> cyclePath = new LinkedHashSet<>(pathState);
                        Integer cycleLength = cyclePath.size();
                        Pair<Set<State>, Integer> pairVar = new Pair<>(cyclePath, cycleLength);
                        cycles.add(pairVar);
                    }
                }
            }
        }
            return cycles ;
    }

    public static Map<Set<State>, PathDetail> computePathsDetails(Automaton automaton) {
        State initialState = automaton.getInitialState();
        Map<State, Set<LinkedHashSet<State>>> paths = getReachableMultPaths(initialState);

        Map<Set<State>, PathDetail> result = new HashMap<>();

        for (Map.Entry<State, Set<LinkedHashSet<State>>> entry : paths.entrySet()) {
            if (entry.getKey().isAccept()) {
                for (LinkedHashSet<State> path : entry.getValue()) {
                    PathDetail detail = new PathDetail();
                    detail.length = path.size() -1 ;
                    for (State state : path) {
                        if (hasSelfLoop(state)) {
                            detail.loops.add(new Pair<>(state, 1));
                        }
                    }
                    List< Pair<Set<State>, Integer>> cyclesDetected = detectCycle(automaton,path);
                    for (Pair<Set<State>,Integer> cycle : cyclesDetected){
                        detail.cycles.add(cycle);
                    }
                    result.put(path, detail);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String reg = "a(a|bcd+e)a*";
        RegExp re = new RegExp(reg);
        Automaton myAuto = new Automaton();
        myAuto = re.toAutomaton(false);
        myAuto = Automaton.minimize(myAuto);
        myAuto.determinize();
        System.out.println(myAuto.toDot());
        Map<Set<State>, PathDetail> details = computePathsDetails(myAuto);
        for (Map.Entry<Set<State>, PathDetail> entry : details.entrySet()) {
            String pathStr = entry.getKey().stream()
                    .map(s -> "s" + s.getNumber())
                    .collect(Collectors.joining("->"));
            System.out.println("Path: " + pathStr + " -> Details: " + entry.getValue());
        }
    }
}



