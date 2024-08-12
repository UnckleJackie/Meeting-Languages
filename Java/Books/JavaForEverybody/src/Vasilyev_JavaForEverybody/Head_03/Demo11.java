package Vasilyev_JavaForEverybody.Head_03;

public class Demo11 {
    public static void main(String[] args) {
        int n = 15;
        int[] Fib = new int[n];
        Fib[0] = 1;
        Fib[1] = 1;
        System.out.print(Fib[0] + " " + Fib[1]);
        for (int k = 2; k < n; k++) {
            Fib[k] = Fib[k -1] + Fib[k - 2];
            System.out.print(" " + Fib[k]);
        }
    }
}
