package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class Demotion {
    void f1(char x) { out.println("f1(char)"); }
    void f1(byte x) { out.println("f1(byte)"); }
    void f1(short x) {out.println("f1(short)"); }
    void f1(int x) { out.println("f1(int)"); }
    void f1(long x) {out.println("f1(long)"); }
    void f1(float x) {out.println("f1(float)"); }
    void f1(double x) { out.println("f1(double)"); }

    void f2(char x) { out.println("f2(char)"); }
    void f2(byte x) { out.println("f2(byte)"); }
    void f2(short x) { out.println("f2(short)"); }
    void f2(int x) { out.println("f2(int)"); }
    void f2(long x) { out.println("f2(long)"); }
    void f2(float x) { out.println("f2(float)"); }

    void f3(char x) { out.println("f3(char)"); }
    void f3(byte x) { out.println("f3(byte)"); }
    void f3(short x) { out.println("f3(short)"); }
    void f3(int x) { out.println("f3(int)"); }
    void f3(long x) { out.println("f3(long)"); }

    void f4(char x) { out.println("f4(char)"); }
    void f4(byte x) { out.println("f4(byte)"); }
    void f4(short x) { out.println("f4(short)"); }
    void f4(int x) { out.println("f4(int)"); }

    void f5(char x) { out.println("f5(char)"); }
    void f5(byte x) { out.println("f5(byte)"); }
    void f5(short x) { out.println("f5(short)"); }

    void f6(char x) { out.println("f6(char)"); }
    void f6(byte x) { out.println("f6(byte)"); }

    void f7(char x) { out.println("f7(char)"); }

    void testDouble() {
        double x = 0;
        out.println("type double parameter: ");
        f1(x); f2((float) x); f3((long) x); f4((int) x);
        f5((short) x); f6((byte) x); f7((char) x);
    }
    public static void main(String[] args) {
        Demotion p = new Demotion();
        p.testDouble();
    }
}
