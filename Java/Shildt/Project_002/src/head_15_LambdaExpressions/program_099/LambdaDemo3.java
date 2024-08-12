package head_15_LambdaExpressions.program_099;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0; // Выясняем, является ли одно число множителем другого
        if (isFactor.test(10, 2))
            System.out.println("2 is the multiplier of 10");
        if (!isFactor.test(10, 3))
            System.out.println("3 is not the multiplier of 10");
    }
}
