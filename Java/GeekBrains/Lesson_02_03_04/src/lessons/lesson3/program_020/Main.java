package lessons.lesson3.program_020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        list.add(2809);
        list.add("1234");

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("\n======ArrayList CREATE======\n\n" +
                "\tArrayList<Integer> list1 = new ArrayList<Integer>();\n" +
                "\tArrayList<Integer> list2 = new ArrayList<>();\n" +
                "\tArrayList<Integer> list3 = new ArrayList<>(10);\n" +
                "\tArrayList<Integer> lest4 = new ArrayList<>(list3);\n");
        List<Integer> list5 = new ArrayList<Integer>();
        list5.add(1);
        list5.add(123);
        // list.add("string line");
        for (Object o : list5) {
            System.out.println(o);
        }

//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = { day, month, year };
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);

        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[] { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new StringBuilder("09");
        System.out.println(d);

        Character value = null;
        List<Character> list6 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list6);
        //list6.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list7 = List.copyOf(list6);
    }
}
