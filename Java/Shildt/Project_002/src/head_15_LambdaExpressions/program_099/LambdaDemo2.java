package head_15_LambdaExpressions.program_099;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("10 -- is even number");
        if (!isEven.test(9)) System.out.println("9 -- is odd number");
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("1 -- is a positive number");
        if (!isNonNeg.test(-1)) System.out.println("-1 is a negative number");
    }
}
