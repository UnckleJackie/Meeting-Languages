package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        out.println("Cups()");
    }
}
