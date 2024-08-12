package head_11.program_075;
// Приостановка и возобновление современным способом
public class NewThread implements Runnable {
    String name;    // name of thread
    Thread t;
    boolean suspendFlag;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
    }
    // point of enter to thread
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized(this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " finishing");
    }
    synchronized void mysuspend() {
        suspendFlag = true;
    }
    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        ob1.t.start();
        ob2.t.start();
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока Ont");
            ob2.mysuspend();
            System.out.println("Приостановка потока Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        // wait for finishing threads
        try {
            System.out.println("Waiting for finishing threads");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is finishing");
    }
}
