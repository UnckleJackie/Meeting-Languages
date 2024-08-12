package Vasilyev_JavaForEverybody.Head_02;

public class Demo7 {
    public static void main(String[] args) {
        int sum= 0, n = 100;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }
}
