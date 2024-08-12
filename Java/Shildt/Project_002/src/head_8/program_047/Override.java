package head_8.program_047;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2, 3);
        subOb.show("It is k: ");  // calling from B
        subOb.show();  // calling from A
    }
}
