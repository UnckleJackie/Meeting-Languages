package Vasilyev_JavaForEverybody.Head_01;

public class Demo11 {
    public static void main(String[] args) {
        double R1 = 3, R2 = 5, R3 = 2, R = 1;
        double r1, r2, r3;
        boolean A, B;
        r1 = R2 * R3 / (R2 + R3) + R1 * R / (R1 + R);
        r2 = R1 * R3 / (R1 + R3) + R2 * R / (R2 + R);
        r3 = R2 * R1 / (R2 + R1) + R3 * R / (R3 + R);
        A = (r1 <= r2) && (r1 <= r3);
        B = (r2 <= r1) && (r2 <= r3);
        System.out.println("Values resists: ");
        System.out.println("First R1 = " + R1 + " Om");
        System.out.println("Second R2 = " + R2 + "Om");
        System.out.println("Third R3 = " + R3 + " Om");
        System.out.println("Main R = " + R3 + " Om");
        System.out.print("To second block applies ");
        System.out.print(A ? "first" : B ? "second" : "third");
        System.out.println(" resistor");
    }
}
