package Vasilyev_JavaForEverybody.Head_13;

public class Demo9 {
    static void next(double x, int n) {
        System.out.println("Approximating: " + x);
        solve((x * x + 12) / 8, n - 1);
    }

    static void solve(double x, int n) {
        if (n == 0) System.out.println("Value: " + x);
        else next(x, n);
    }

    public static void main(String[] args) {
        solve(0, 7);
    }
}
