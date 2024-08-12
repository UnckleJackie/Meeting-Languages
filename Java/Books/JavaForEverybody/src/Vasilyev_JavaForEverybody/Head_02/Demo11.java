package Vasilyev_JavaForEverybody.Head_02;

public class Demo11 {
    public static void main(String[] args) {
        int sum = 0, i = 1, n = 100;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }
}
