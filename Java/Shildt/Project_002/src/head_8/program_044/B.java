package head_8.program_044;

public class B extends A {
    int i;  // this member i hides i in A

    B(int a, int b) {
        super.i = a;    // i in A
        i = b;          // i in B
    }

    void show() {
        System.out.println("\ni in superclass: " + super.i +
                "\ni in subclass: " + i);
    }
}
