package Head_02_Operators.Block_002;

import static java.lang.System.out;

public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        out.println("Math.round(above): " + Math.round(above));
        out.println("Math.round(below): " + Math.round(below));
        out.println("Math.round(fabove): " + Math.round(fabove));
        out.println("Math.round(fbelow): " + Math.round(fbelow));
    }
}
