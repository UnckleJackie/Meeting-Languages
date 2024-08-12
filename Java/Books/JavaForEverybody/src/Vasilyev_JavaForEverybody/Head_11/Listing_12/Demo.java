package Vasilyev_JavaForEverybody.Head_11.Listing_12;

import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector<String> str = new Vector<>();
        System.out.println(str);
        System.out.println("Size: " + str.size());
        str.addElement("First");
        str.addElement("Second");
        str.addElement("Third");
        System.out.println(str);
        System.out.println("Size: " + str.size());
        str.add(0, "Initial");
        str.add(2, "Additive");
        System.out.println(str);
        System.out.println("Size: " + str.size());
        str.setSize(str.size() - 2);
        System.out.println(str);
        System.out.println("Size: " + str.size());
    }
}
