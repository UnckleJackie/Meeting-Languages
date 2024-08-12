package Vasilyev_JavaForEverybody.Head_10.Listing_08;

import java.util.Date;

public class Demo {
    public static void main(String args[]) throws InterruptedException {
        System.out.print("Main thread. ");
        System.out.println("Time: " + new Date());
        MyThread A = new MyThread("Alpha", 5000, 5);
        MyThread B = new MyThread("Bravo", 6000, 4);
        MyThread C = new MyThread("Charlie", 7000, 3);
        if (A.isAlive()) A.join();
        if (B.isAlive()) B.join();
        if (C.isAlive()) C.join();
        System.out.print("Main thread. ");
        System.out.println("Time: " + new Date());
    }
}
