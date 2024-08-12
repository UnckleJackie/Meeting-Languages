package head_10.program_064;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Upper level");
        e.initCause(new ArithmeticException("Cause")); // add cause
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // Display upper level exception
            System.out.println("Catched: " + e);
            // Display cause-exception
            System.out.println("Initial cause: " + e.getCause());
        }
    }
}
