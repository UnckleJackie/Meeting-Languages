package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class House {
    Window w1 = new Window(1);
    House() {
        out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        out.println("f()");
    }
    Window w3 = new Window(3);
}
