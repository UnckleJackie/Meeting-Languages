package Vasilyev_JavaForEverybody.Head_02;

public class Demo17 {
    public static void main(String[] args) {
        int n = 5000, k;
        double Pi = 2, q = Math.sqrt(2);
        for (k = 1; k <= n; k++) {
            Pi *= 2 / q;
            q = Math.sqrt(2 + q);
        }
        System.out.println("Calculated on " + n + " multipliers:");
        System.out.println(Pi);
    }
}
