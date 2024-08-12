package Vasilyev_JavaForEverybody.Head_10.Listing_05;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main thread running");
        MyThread mt = new MyThread();
        mt.start();
        try {
            if (mt.isAlive()) mt.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Main thread is over!");
    }
}
