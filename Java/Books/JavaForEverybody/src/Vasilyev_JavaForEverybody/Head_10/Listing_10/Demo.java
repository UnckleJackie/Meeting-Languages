package Vasilyev_JavaForEverybody.Head_10.Listing_10;

public class Demo {
    public synchronized static void show() {
        Thread t = Thread.currentThread();
        for (int k = 1; k <= 3; k++) {
            System.out.println(t.getName() + " [" + k + "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new MyThread("Alpha");
        new MyThread("Bravo");
    }
}
