package Vasilyev_JavaForEverybody.Head_08;

public class Demo6 {
    public static void main(String[] args) {
        String str = " Programming on C++ ";
        System.out.println("str: " + str);
        str = str.trim();
        System.out.println("str: " + str);
        String A, B, C, D, E, F;
        A = str.substring(3, 8);
        System.out.println("A: " + A);
        B = str.concat(" and Java");
        System.out.println("B: " + B);
        C = B.replace(' ', '_');
        System.out.println("C: " + C);
        D = B.toLowerCase();
        System.out.println("D: " + D);
        E = B.toUpperCase();
        System.out.println("E: " + E);
        F = String.join(" + ", " one ", " two ", " three ");
        System.out.println("F: " + F);
        String[] txt = B.split(" ");
        for (int k = 0; k < txt.length; k++) {
            System.out.print("|" + txt[k]);
        }
        System.out.println("|");
    }
}
