package head_13.program_096;

public class MyClass2 {
    int a;
    int b;
    MyClass2(int i, int j) {
        a = i;
        b = j;
    }
    MyClass2(int i) {
        this(i, i); // calling MyClass2(i, i)
    }
    MyClass2() {
        this(0);    // calling MyClass2(0);
    }
}
