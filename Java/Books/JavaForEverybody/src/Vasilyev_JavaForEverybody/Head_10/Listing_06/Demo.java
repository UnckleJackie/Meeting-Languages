package Vasilyev_JavaForEverybody.Head_10.Listing_06;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main thread running");
        MyThread mt = new MyThread();
        mt.start();
        try {
            Thread.sleep(8000);
            mt.interrupt();
            if (mt.isAlive()) mt.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Main thread is over!");
    }
}
