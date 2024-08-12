package Vasilyev_JavaForEverybody.Head_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int a, b, s = 0;
        Scanner p = new Scanner(System.in);
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Set two indexes (from 0 to " + (nums.length - 1) + ")");
        try {
            System.out.print("First index: ");
            a = p.nextInt();
            System.out.print("Second index: ");
            b = p.nextInt();
            for (int k = a; k <= b; k++) {
                s += nums[k];
                System.out.print(nums[k] + " ");
            }
            System.out.println();
            System.out.println("One more number: " + s / (b - a));
        } catch (InputMismatchException e) {
            System.out.println("Format data error!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nOut of bounds of Array");
        } catch (ArithmeticException e) {
            System.out.println("Dividing to zero error!");
        }
        System.out.println("Program is over!");
    }
}
