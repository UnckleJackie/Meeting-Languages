package Vasilyev_JavaForEverybody.Head_10.Listing_06;

public class MyThread extends Thread {
    public void run() {
        try {
            int k = 1;
            System.out.println("Affiliated thread running");
            while (true) {
                Thread.sleep(1500);
                System.out.println("Affiliated thread: " + k++);
            }
        } catch (InterruptedException e) {
            System.out.println("Affiliated thread is over!");
        }
    }
}
