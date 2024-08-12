package head_13.program_095_instanceof;

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("a is the item of A");
        if (b instanceof B)
            System.out.println("b is the item of B");
        if (c instanceof C)
            System.out.println("c is the item of C");
        if (c instanceof A)
            System.out.println("c is the item of A");
        if (a instanceof C)
            System.out.println("a could be init to C");
        System.out.println();

        A ob;   // Сравнить типы производных классов
        ob = d; // link to d
        System.out.println("now ob links to d");
        if (ob instanceof D)
            System.out.println("ob is the item of D");
        System.out.println();
        ob = c; // link to c
        System.out.println("now ob links to c");
        if (ob instanceof D)
            System.out.println("ob could be init to D");
        else
            System.out.println("ob couldn't init to D");
        if (ob instanceof A)
            System.out.println("ob could be init to A");
        System.out.println();

        if (a instanceof Object)    // All objects could be init to Object
            System.out.println("a could be init to Object");
        if (b instanceof Object)
            System.out.println("b could be init to Object");
        if (c instanceof Object)
            System.out.println("c could be init to Object");
        if (d instanceof Object)
            System.out.println("d could be init to Object");
    }
}
