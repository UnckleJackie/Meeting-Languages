package Vasilyev_JavaForEverybody.Head_02;

public class Demo15 {
    public static void main(String[] args) {
        int n = 100000;
        int i, j;
        long count = 0;
        double x, y, Pi;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
                x = (double) i / n;
                y = (double) j / n;
                if ((x - 0.5) * (x - 0.5) + (y - 0.5) * (y - 0.5) <= 0.25) {
                    count++;
                }
            }
        }
        Pi = 4.0 * count / (n + 1) / (n + 1);
        System.out.println("Calculating value on " + (long)(n + 1) * (n + 1) + " points:");
        System.out.println(Pi);
    }
}
