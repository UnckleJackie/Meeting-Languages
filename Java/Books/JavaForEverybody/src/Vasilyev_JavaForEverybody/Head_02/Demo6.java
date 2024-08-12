package Vasilyev_JavaForEverybody.Head_02;

public class Demo6 {
    public static void main(String[] args) {
        int i, n = 100;
        int sum = 0;
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to " + n + ": " + sum);
    }
}
