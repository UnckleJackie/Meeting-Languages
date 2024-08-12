package Vasilyev_JavaForEverybody.Head_10.Listing_01;

public class MyClass implements Runnable {
    private String[] txt;

    MyClass(String[] txt) {
        this.txt = txt;
    }

    public void run() {
        for (int k = 0; k < txt.length; k++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("[" + (k + 1) + "] " + txt[k]);
        }
    }
}
