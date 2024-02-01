import dk.brics.automaton.*;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.StringEscapeUtils;

public class Debugging {
    public static void main(String[] args) {
        String reg = "(x|y|xy)*";
        reg = AutomatonMaker.startAndEnd(reg);
        String unescaped = StringEscapeUtils.unescapeJava(reg);
        RegExp re =  new RegExp(reg, 0);
        Automaton myAuto = new Automaton();
        myAuto = re.toAutomaton(false);
        System.out.println("Final/Actual Automaton: \n " + myAuto.toDot());
//        Pair<List<List<String>>, List<Automaton>> slAnswers = AutomatonMaker.slregex(reg, myAuto);
        Pair<List<List<String>>, List<Automaton>> expAnswers = AutomatonMaker.expregex(myAuto, reg);
    }
}
