package head_10.program_062;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {   // keep track the code block
            d = 0;
            a = 42 / d;
            System.out.println("It wouldn't output");
        } catch (ArithmeticException e) { // перехватить ошибку деления на 0
            System.out.println("Dividing to ZERO");
        }
        System.out.println("After catch operator");
    }
}
