package Vasilyev_JavaForEverybody.Head_11.Listing_15;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Double> objs = new TreeSet<>();
        objs.add(100.0);
        objs.add(200.0);
        objs.add(300.0);
        System.out.println(objs);
        objs.add(200.0);
        System.out.println(objs);
        objs.remove(100.0);
        System.out.println(objs);
        objs.add(123.0);
        System.out.println(objs);
    }
}
