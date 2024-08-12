package Program_003;

import java.util.Scanner;
public class Program003 {

    public static void main (String[] args) {
        System.out.println("\n========Primitive Calculator!!!=============\n");

        Scanner scan = new Scanner(System.in);

        float num1 = 50, num2 = 33;
        float ressum = num1 + num2;
        float resDivide = num1 / num2;
        ressum += 10;
        resDivide++;
        System.out.println("Result of sum num1 and num2 = " + ressum + "\n" +
                "Divide num1 to num2 = " + resDivide);

        System.out.print("\nEnter the first number: ");
        float number1 = scan.nextFloat();

        System.out.print("\nEnter the second number: ");
        float number2 = scan.nextFloat();

        float sum = number1 + number2;
        float divide1 = number1 / number2;
        float divide2 = number2 / number1;
        float multiple = number1 * number2;

        System.out.println("\nSum is " + sum + "\n" +
                "Division " + number1 + " to " + number2 + " is " + divide1 + "\n" +
                "Division " + number2 + " to " + number1 + " is " + divide2 + "\n" +
                "Multiple is " + multiple + "\n");
    }
}
