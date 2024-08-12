package Vasilyev_JavaForEverybody.Head_10.Listing_08;

import java.util.Date;

public class MyThread extends Thread {
    private int time;
    private int count;

    MyThread(String name, int time, int count) {
        super(name);
        this.time = time;
        this.count = count;
        System.out.println("Created thread: " + getName() + ". ");
        System.out.println("Time: " + new Date());
        start();
    }

    public void run() {
        try {
            for (int k = 1; k <= count; k++) {
                System.out.print("[" + k + "/" + count + "] " + getName() + ". ");
                System.out.println("Time: " + new Date());
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
        }
        System.out.print("Thread: " + getName() + "is over! ");
        System.out.println("Time: " + new Date());
    }
}
