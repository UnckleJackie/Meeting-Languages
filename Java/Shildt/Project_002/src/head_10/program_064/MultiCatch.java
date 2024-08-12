package head_10.program_064;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = { 1, 2, 3 };
        try {
            //int result = a / b; // generate exception ArithmeticException
            vals[10] = 19;   //generate exception ArrayIndexOutOfBoundsException
            // Next construction catches both exceptions
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception catched: " + e);
        }
        System.out.println("After multi-catch");
    }
}
