package Vasilyev_JavaForEverybody.Head_02;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        a = input.nextInt();
        if (a == 0) {
            System.out.println("You entered zero!");
        } else if (a == 1) {
            System.out.println("You entered one");
        } else if (a % 2 == 0) {
            System.out.println("You entered good number!");
        } else {
            System.out.println("You entered odd number!");
        }
        System.out.println("Thank you!");
    }
}
