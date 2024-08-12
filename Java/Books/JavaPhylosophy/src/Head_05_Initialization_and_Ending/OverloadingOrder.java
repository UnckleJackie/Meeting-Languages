package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class OverloadingOrder {
    static void f(String s, int i) {
        out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s) {
        out.println("int: " + i + ", String: " + s);
    }
    public static void main(String[] args) {
        f("Firstly string", 11);
        f(99, "Firstly number");
    }
}
