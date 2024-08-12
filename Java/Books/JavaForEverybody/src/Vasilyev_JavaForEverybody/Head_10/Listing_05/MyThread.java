package Vasilyev_JavaForEverybody.Head_10.Listing_05;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Affiliated thread running");
        for (int k = 1; k < 5; k++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {

            }
            System.out.println("Affiliated thread: " + k);
        }
        System.out.println("Affiliated thread is over!");
    }
}
