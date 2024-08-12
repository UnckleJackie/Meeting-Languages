package head_10.program_062;

public class MultipleCatches2 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = { 1 };
            c[42] = 99;
        } catch(Exception e) {
            System.out.println("Dividing to ZERO! " + e);
        }
        System.out.println("After blocks try / catch");
    }
}
