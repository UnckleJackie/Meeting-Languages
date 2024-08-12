package Vasilyev_JavaForEverybody.Head_10.Listing_07;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        MyThread mt = new MyThread();
        mt.setDaemon(true);
        mt.start();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
        }
        System.out.println("Main thread is over!");
    }
}
