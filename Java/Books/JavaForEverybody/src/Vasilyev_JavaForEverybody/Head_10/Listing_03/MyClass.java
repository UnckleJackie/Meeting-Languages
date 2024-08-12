package Vasilyev_JavaForEverybody.Head_10.Listing_03;

public class MyClass extends Thread {
    private String[] txt;

    MyClass(String[] txt, String name) {
        super();
        setName(name);
        this.txt = txt;
        System.out.println("Thread created: " + getName());
        start();
    }


    public void run() {
        for (int k = 0; k < txt.length; k++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("[" + (k + 1) + "] " + txt[k]);
        }
        System.out.println("Thres " + getName() + " is over!");
    }
}
