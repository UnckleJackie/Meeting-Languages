package Head_02_Operators.Block_002;

import static java.lang.System.out;

public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
    static int standardIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }
    public static void main(String[] args) {
        out.println(ternary(9));
        out.println(ternary(10));
        out.println(standardIfElse(9));
        out.println(standardIfElse(10));
    }
}
