package head_15_LambdaExpressions.program_099;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        // This block lambda-expression calculates factorial value int
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Factorial 3 is " + factorial.func(3));
        System.out.println("Factorial 5 is " + factorial.func(5));
    }
}
