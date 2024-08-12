package Vasilyev_JavaForEverybody.Head_11.Listing_14;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<String> objs = new HashSet<>();
        objs.add("First");
        objs.add("Second");
        objs.add("Third");
        objs.add("Fourth");
        System.out.println(objs);
        objs.add("Second");
        System.out.println(objs);
        System.out.println("Size: " + objs.size());
        objs.remove("First");
        System.out.println(objs);
        objs.add("Fifth");
        System.out.println(objs);
        if (!objs.contains("First")) {
            System.out.println("Element \"First\" absent!");
        }
        if (objs.contains("Fourth")) {
            System.out.println("Element \"Fourth\" is here");
        }
    }
}
