package head_11.program_068;
// Create many threads
public class NewThread implements Runnable {
    String name;    // name of thread
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }
    // It's a point of enter for thread
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

class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");
        // Launch threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            // Wait for finishing other threads
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Finishing of main thread");
    }
}
