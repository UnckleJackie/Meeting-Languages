package head_11.program_067;
// Create second thread by extension of class Thread
public class NewThread extends Thread {
    NewThread() {
        // Create new, second thread
        super("Demo Thread");
        System.out.println("Affiliate thread: " + this);
    }

    // It is point of enter for second thread
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Affiliate thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Affiliate thread is interrupted");
        }
        System.out.println("Finishing of affiliated thread");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Finishing of main thread");
    }
}
