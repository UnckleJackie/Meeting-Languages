package head_10.program_063;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demonstration");
        } catch(NullPointerException e) {
            System.out.println("catched inside demoproc().");
            throw e;    // generate exception again
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("catched again: " + e);
        }
    }
}
