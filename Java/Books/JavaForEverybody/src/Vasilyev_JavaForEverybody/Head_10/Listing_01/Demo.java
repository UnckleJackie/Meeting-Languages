package Vasilyev_JavaForEverybody.Head_10.Listing_01;

public class Demo {
    public static void main(String[] args) {
        String[] cls = {"Red", "Yellow", "Green", "Blue"};
        char[] symbs = {'J', 'A', 'V', 'A'};
        MyClass obj = new MyClass(cls);
        Thread t = new Thread(obj);
        t.start();
        for (int k = 0; k < symbs.length; k++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            System.out.println("Main thread: " + symbs[k]);
        }
    }
}
