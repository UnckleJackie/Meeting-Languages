package head_15_LambdaExpressions.program_099;

public class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        MyStringOps2 strOps = new MyStringOps2();
        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Source string: " + inStr);
        System.out.println("Reverse string: " + outStr);
    }
}
