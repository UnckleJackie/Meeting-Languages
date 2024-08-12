package head_11.program_066;
// create new thread
public class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Affiliate thread: " + t);
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
        System.out.println("Finishing of affiliate thread");
    }

    public static NewThread createAndStart() {
        NewThread myThrd = new NewThread();
        myThrd.t.start();
        return myThrd;
    }
}

class ThreadDemo {

    public static void main(String[] args) {
        NewThread nt = NewThread.createAndStart();
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
