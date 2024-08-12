package head_15_LambdaExpressions.program_099;

public class LambdaAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        System.out.println("Source string: " + inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("String to upper case: " + outStr);
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++)
                if(str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("String after deleting spaces: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Reverse string: " + stringOp(reverse, inStr));
    }
}
