package head_15_LambdaExpressions.program_099;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.toUpperCase().charAt(i) + " ";
            return result;
        };
        System.out.println("String Lambda with opposite words order: " + reverse.func("Lambda"));
        System.out.println("String Expression with opposite words orger: " + reverse.func("Expression"));
    }
}
