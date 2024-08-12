package Vasilyev_JavaForEverybody.Head_10.Listing_09;

public class Demo {
    public static void main(String[] args) {
        Thread t;
        t = Thread.currentThread();
        System.out.println("Main thread: " + t);
        t.setName("Demo");
        System.out.println("Thread changed name: " + t);
        t.setPriority(7);
        System.out.println("Thread changed priority: " + t);
    }
}
