package Vasilyev_JavaForEverybody.Head_10.Listing_04;

public class Demo {
    public static void main(String[] args) {
        String[] cls = {"Red", "Yellow", "Green", "Blue"};
        char[] symbs = {'J', 'A', 'V', 'A'};
        Thread t = new Thread(() -> {
            for (int k = 0; k < cls.length; k++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("[" + (k + 1) + "] " + cls[k]);
            }
        });
        t.start();
        for (int k = 0; k < symbs.length; k++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            System.out.println("Main Thread is over!");
        }
    }
}
