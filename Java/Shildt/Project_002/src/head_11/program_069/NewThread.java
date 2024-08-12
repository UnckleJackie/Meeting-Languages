package head_11.program_069;
// Using join() for waiting finishing of threads
public class NewThread implements Runnable {
    String name;
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " is interrupted");
        }
        System.out.println(name + " is finished");
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        System.out.println("Thread One is working: " + nt1.t.isAlive());
        System.out.println("Tread Two is working: " + nt2.t.isAlive());
        System.out.println("Thread Three is working: " + nt3.t.isAlive());

        // Wait for finishing thread
        try {
            System.out.println("Waiting for finishing threads");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Thread One is working: " + nt1.t.isAlive());
        System.out.println("Thread Two is working: " + nt2.t.isAlive());
        System.out.println("Thread Three is working: " + nt3.t.isAlive());
        System.out.println("Finishing of main thread");
    }
}
