package Vasilyev_JavaForEverybody.Head_10.Listing_11;

public class MyThread extends Thread {
    MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        synchronized (Demo.nums) {
            for (int k = 0; k < Demo.nums.length; k++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(getName() + "[" + Demo.nums[k] + "]");
            }
        }
    }
}
