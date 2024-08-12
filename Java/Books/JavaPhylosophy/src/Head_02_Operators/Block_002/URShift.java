package Head_02_Operators.Block_002;

import static java.lang.System.out;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        out.println(Integer.toBinaryString(i));
        i >>>= 10;
        out.println(Integer.toBinaryString(i));
        long l = -1;
        out.println(Long.toBinaryString(i));
        l >>>= 10;
        out.println(Long.toBinaryString(l));
        short s = -1;
        out.println(Integer.toBinaryString(s));
        s >>>= 10;
        out.println(Integer.toBinaryString(s));
        byte b = -1;
        out.println(Integer.toBinaryString(b));
        b >>>= 10;
        out.println(Integer.toBinaryString(b));
        b = -1;
        out.println(Integer.toBinaryString(b));
        out.println(Integer.toBinaryString(b>>>10));
    }
}
