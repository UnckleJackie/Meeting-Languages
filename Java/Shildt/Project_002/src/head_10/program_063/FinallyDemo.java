package head_10.program_063;

public class FinallyDemo {
    static void procA() { // Generate exception inside method
        try {
            System.out.println("Inside method procA()");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Block finally of method procA()");
        }
    }

    // Return direction from block try
    static void procB() {
        try {
            System.out.println("Inside method procB()");
            return;
        } finally {
            System.out.println("Block finally of procB() method");
        }
    }
    // Do block try regularly
    static void procC() {
        try {
            System.out.println("Inside method procC()");
        } finally {
            System.out.println("Block finally of method procC()");
        }
    }
    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception catched");
        }
        procB();
        procC();
    }
}
