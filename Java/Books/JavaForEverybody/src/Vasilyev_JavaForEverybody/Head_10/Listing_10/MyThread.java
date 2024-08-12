package Vasilyev_JavaForEverybody.Head_10.Listing_10;

public class MyThread extends Thread {
    MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        Demo.show();
    }
}
