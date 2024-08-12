package head_9.program_057;
// Example of Nested interface. Class A contents member-interface
public class A {
    public interface NestedIF { // Nested interface
        boolean isNotNegative(int x);
    }
}
// Class B realises nested interface
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
class NestedIFDemo {
    public static void main(String[] args) {
        // Use link to nested interface
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("10 in not negative");
        if (nif.isNotNegative(-12))
            System.out.println("It wouldn't output");
    }
}