package head_8.program_050;

abstract class A {
    abstract void callme();

    void callmetoo() {
        // Конкретные методы в абстрактных классах по-прежнему разрешены.
        System.out.println("This is concrete method");
    }
}

class B extends A {
    void callme() {
        System.out.println("Realize callme() in class B");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}
