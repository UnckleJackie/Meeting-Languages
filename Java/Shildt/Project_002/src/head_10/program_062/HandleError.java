package head_10.program_062;
import java.util.Random;
// Handling Exception and continue the work
public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e);
                a = 0; // set a to zero and go on
            }
            System.out.println("a: " + a);
        }
    }
}
