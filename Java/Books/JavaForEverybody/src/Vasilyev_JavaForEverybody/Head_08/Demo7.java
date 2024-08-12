package Vasilyev_JavaForEverybody.Head_08;

public class Demo7 {
    public static void main(String[] args) {
        int num = 54321;
        double val = 12.34567;
        char symb ='R';
        String txt = "Java";
        String A = String.format("Integer number %1$+010d and symbol %2$4c", num, symb);
        String B = String.format("Text \'%1$-7s\" and number %2$e", txt, val);
        String C = String.format("Number %1$07x - is the same %1$07o", num);
        String D = String.format("Number: %1$ d\nNumber: %2$ d", num, -num);
        String E = String.format("Number: %012.3f", val);
        String F = String.format("Scientific notation: %12.3e", val);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
