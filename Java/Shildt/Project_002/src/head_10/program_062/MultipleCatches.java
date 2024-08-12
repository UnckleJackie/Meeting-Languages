package head_10.program_062;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = { 1 };
            c[42] = 99;
        } catch(ArithmeticException e) {
            System.out.println("Dividing to ZERO! " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound array: " + e);
        }
        System.out.println("After blocks try / catch");
    }
}
