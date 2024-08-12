package head_8.program_042;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        // Суперкласс можно использовать сам по себе.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb content is: ");
        superOb.showij();
        System.out.println();

        // подкласс имеет доступ ко всем открытым членам своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb content is: ");
        subOb.showij();
        subOb.showk();
        System.out.println("Sum of i, j and k in subOb: ");
        subOb.sum();
    }
}
