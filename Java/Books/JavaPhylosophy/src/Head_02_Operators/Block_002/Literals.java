package Head_02_Operators.Block_002;

import static java.lang.System.out;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F;
        out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177;
        out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff;
        out.print("c: " + Integer.toBinaryString(c));
        byte b = 0x7f;
        out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff;
        out.print("s: " + Integer.toBinaryString(s));
        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;
    }
}
