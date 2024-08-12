package Vasilyev_JavaForEverybody.Head_02;

public class Demo12 {
    public static void main(String[] args) {
        int sum = 0, i = 1, n = 100;
        do {
            sum += i;
            i += 2;
        } while (i <= n);
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }
}
