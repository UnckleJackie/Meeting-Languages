package Program_005;

import java.util.*;
public class Program005 {
    public static void main (String[] args) {
        System.out.println("\n=======SWITCH - CASE operators=======\n");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1: System.out.println("Number is 1");
            break;
            case 2: System.out.println("Number is 2");
            break;
            case 3: System.out.println("Number is 3");
            break;
            default: System.out.println("Unknown number!");
            break;
        }
        System.out.println("\n=====And now we'll play the calculator!======\n");
        System.out.print("\nEnter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("\nEnter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("\nAction: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+": System.out.println("Sum is " + (num1 + num2));
            break;

            case "-": System.out.println("Difference is " + (num1 - num2));
            break;

            case "/":
                if (num2 == 0)
                    System.out.print("Don't be a fool, chap!");
                else {
                System.out.println("int Division is " + (num1 / num2));}
            break;

            case "*": System.out.println("Multiple is " + (num1 * num2));
            break;

            case "%": System.out.println("Rest from division is " + (num1 % num2));
            break;
            default:
                System.out.println("You entered something wrong!");
        }
    }
}
