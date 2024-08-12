package Vasilyev_JavaForEverybody.Head_02;

public class Demo16 {
    public static void main(String[] args) {
        int n = 5000000, k;
        double Pi = 0, q = 4;
        for (k = 0; k <= n; k++) {
            Pi += q / (2 * k + 1);
            q *= (-1);
        }
        System.out.println("Calculated on " + n + " additions: ");
        System.out.println(Pi);
    }
}
