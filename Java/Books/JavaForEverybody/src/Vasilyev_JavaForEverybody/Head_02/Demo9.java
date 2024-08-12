package Vasilyev_JavaForEverybody.Head_02;

public class Demo9 {
    public static void main(String[] args) {
        int sum = 0, i = 1, n = 100;
        for (; i <= n; ) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of odd numvers from 1 to " + n + ": " + sum);
    }
}
