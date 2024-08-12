package Vasilyev_JavaForEverybody.Head_02;

import java.util.Random;

public class Demo19 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a, b, c;
        a = rand.nextInt();
        b = rand.nextInt();
        c = rand.nextInt();
        double x1, x2, D;
        System.out.println("Equation parameters:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        if (a == 0) {
            System.out.println("Linear equation!");
            if (b != 0) {
                System.out.println("Solve x = " + (-c / b) + ".");
            } else {
                if (c == 0) {
                    System.out.println("Solve is any number.");
                } else {
                    System.out.println("There are no solves!");
                }
            }
        } else {
            System.out.println("Square equation!");
            D = b * b - 4 * a * c;
            if(D < 0) {
                System.out.println("There are no solves!");
            } else {
                if (D == 0) {
                    System.out.println("Solve x = " + (-b / 2 / a));
                } else {
                    x1 = (-b - Math.sqrt(D)) / 2 / a;
                    x2 = (-b + Math.sqrt(D)) / 2 / a;
                    System.out.println("Two solves: x = " + x1 + " and x = " + x2 + ".");
                }
            }
        }
        System.out.println("Work over!");
    }
}
