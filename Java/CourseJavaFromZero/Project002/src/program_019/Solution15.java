package program_019;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(z);
        } catch(InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch(ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
