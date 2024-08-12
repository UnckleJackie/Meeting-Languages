package head_11.program_074;
// Example emerging interlock
public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered to A.foo");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("A interrupted");
        }
        System.out.println(name + " tries to call B.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("Inside A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered to B.bar");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("B interrupted");
        }
        System.out.println(name + " tries to call A.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside B.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    Thread t;
    Deadlock() {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "RacingThread");
    }
    void deadlockStart() {
        t.start();
        a.foo(b);   // get block on a in this thread
        System.out.println("Back to main thread");
    }
    public void run() {
        b.bar(a); // get block on b in other thread
        System.out.println("Back to other thread");
    }
    public static void main(String[] args) {
        Deadlock d1 = new Deadlock();
        d1.deadlockStart();
    }
}
