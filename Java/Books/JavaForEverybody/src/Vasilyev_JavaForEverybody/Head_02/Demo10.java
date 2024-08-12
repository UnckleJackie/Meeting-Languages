package Vasilyev_JavaForEverybody.Head_02;

public class Demo10 {
    public static void main(String[] args) {
        int sum = 0, i = 1, n = 100;
        for (;;) {
            sum += i;
            i += 2;
            if (i > n) break;
        }
        System.out.println("Sum of odd number from 1 to " + n + ": " + sum);
    }
}
