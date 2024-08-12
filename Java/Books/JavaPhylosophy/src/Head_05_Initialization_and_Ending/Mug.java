package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class Mug {
    Mug(int marker) {
        out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        out.println("f(" + marker + ")");
    }
}
