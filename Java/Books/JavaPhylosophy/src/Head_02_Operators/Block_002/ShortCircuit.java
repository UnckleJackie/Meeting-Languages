package Head_02_Operators.Block_002;

import static java.lang.System.out;

public class ShortCircuit {
    static boolean test1(int val) {
        out.println("test1(" + val + ")");
        out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        out.println("test2(" + val + ")");
        out.println("result: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        out.println("test3(" + val + ")");
        out.println("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        out.println("expression: " + b);
    }
}