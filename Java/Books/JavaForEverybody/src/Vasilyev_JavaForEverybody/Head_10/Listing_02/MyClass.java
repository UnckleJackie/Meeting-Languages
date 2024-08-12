package Vasilyev_JavaForEverybody.Head_10.Listing_02;

public class MyClass implements Runnable {
    private String[] txt;
    private Thread t;

    MyClass(String[] txt, String name) {
        this.txt = txt;
        t = new Thread(this, name);
        System.out.println("Created thread: " + t.getName());
        t.start();
    }

    public void run() {
        for (int k = 0; k < txt.length; k++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("[" + (k + 1) + "] " + txt[k]);
        }
        System.out.println("Finishing thread " + t.getName());
    }
}
