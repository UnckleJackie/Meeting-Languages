package seminars.sem4.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(2);
        list.addLast(7);
        list.addLast(4);
        System.out.println(list);
        // list.deleteByIndex(5);
        // System.out.println(list.getByIndex(0));
        // list.insertByIndex(-3, 0);
        // list.setByIndex(-1, 4);
        System.out.println(list);
    }
}
