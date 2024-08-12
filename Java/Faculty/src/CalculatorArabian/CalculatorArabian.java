package CalculatorArabian;

import java.util.Scanner;

public class CalculatorArabian {
    public static void main(String[] args) {
        // 2 + 3 and V - VII
        Converter converter = new Converter();
        String[] actions = { "+", "-", "/", "*" };
        String[] regexActions = { "\\+", "-", "/", "\\*" };
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String exp = scn.nextLine();
        // Define ariphmethic action:
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        // If we didn't find action, close the program
        if (actionIndex == -1) {
            System.out.println("Don't fuck my brain, homie!");
            return;
        }
        // "2 - 4" .split("-") -> {"2", "4"}
        String[] data = exp.split(regexActions[actionIndex]);
        // Define digits format
        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
            int a, b;
            // Convert arabian string to number
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            // Do actions
            int result = 0;
            switch (actions[actionIndex]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }
            // if numbers are arabian, return result in arabian view
            System.out.println(result);
        } else {
            System.out.println("Numbers must be in identical format!");
        }
    }
}
