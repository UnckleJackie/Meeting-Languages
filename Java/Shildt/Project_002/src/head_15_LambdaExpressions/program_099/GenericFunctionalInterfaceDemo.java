package head_15_LambdaExpressions.program_099;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.toUpperCase().charAt(i);
            return result;
        };
        System.out.println("Lambda reverse to upper case: " + reverse.func("Lambda"));
        System.out.println("Expression reverse to upper case: " + reverse.func("Expression"));
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };
        System.out.println("3! = " + factorial.func(3));
        System.out.println("15! = " + factorial.func(15));
    }
}
