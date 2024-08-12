package Vasilyev_JavaForEverybody.Head_11.Listing_13;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Character> symbs = new LinkedList<>();
        symbs.add('A');
        System.out.println(symbs);
        symbs.add(0, 'B');
        System.out.println(symbs);
        symbs.addLast('C');
        System.out.println(symbs);
        symbs.removeFirst();
        System.out.println(symbs);
        symbs.add(0, 'D');
        System.out.println(symbs);
        symbs.removeLast();
        System.out.println(symbs);
        symbs.addLast('E');
        System.out.println(symbs);
    }
}
