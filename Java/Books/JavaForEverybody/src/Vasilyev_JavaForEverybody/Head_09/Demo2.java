package Vasilyev_JavaForEverybody.Head_09;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");
        try {
            a = p.nextInt();
            System.out.print("Enter second number: ");
            b = p.nextInt();
            System.out.println("Integer dividing: ");
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (Exception e) {
            System.out.println("Shit happened!");
            System.out.println(e);
            System.out.println("Desctiption: " + e.getMessage());
        }
        System.out.println("Program is over!");
    }
}
