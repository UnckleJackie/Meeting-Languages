package Head_02_Operators.Block_002;

import static java.lang.System.out;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        out.println(s + x + y + z);
        out.println(x + " " + s);
        s += "(summed) = ";
        out.println(s + (x + y + z));
        out.println("" + x);
    }
}
