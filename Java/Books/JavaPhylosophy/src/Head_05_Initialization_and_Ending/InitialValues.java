package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues() {
        out.println("Data type     Initial value");
        out.println("boolean       " + t);
        out.println("char          [" + c + "]");
        out.println("byte          " + b);
        out.println("short         " + s);
        out.println("int           " + i);
        out.println("long          " + l);
        out.println("float         " + f);
        out.println("double        " + d);
        out.println("reference     " + reference);
    }
    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
        /* Maybe next variant:
        new InitialValues().printInitialValues();
         */
    }
}
