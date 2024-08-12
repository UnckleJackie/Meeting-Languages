package seminars.sem1.task8_Homework;
class Calculator {
    public double calculate(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
            if (b != 0) {
                result = a / b;
            } else {
                return -1;
            }
                break;
            case '*':
                result = a * b;
        }
        return result;
    }
}
public class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
