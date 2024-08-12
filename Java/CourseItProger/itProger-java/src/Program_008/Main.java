package Program_008;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Java collections
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Byte> bytes = new ArrayList<>();
        ArrayList<Float> floats = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();

        ints.add(6);
        ints.add(24);

        bytes.add((byte) 8);
        bytes.add((byte) 50);

        floats.add(6343.0f);
        floats.add(354899.3f);
        floats.add(0, 15.0f);

        chars.add('x');
        chars.add('T');

        for (Integer item : ints) { System.out.print(item + "\t"); }
        System.out.println("\nSize of ints: " + ints.size());
        for (Byte item : bytes) { System.out.print(item + "\t"); }
        System.out.println("\nSize of bytes: " + bytes.size());
        for (Float item : floats) { System.out.print(item + "\t"); }
        System.out.println("\nSize of floats: " + floats.size());
        for (Character item : chars) { System.out.print(item + "\t"); }
        System.out.println("\nSize of chars: " + chars.size());
        for (int i = 30; i < 50; i++) {
            chars.add((char) i);
        }
        for (Character item : chars) { System.out.print(item + "\t"); }
        System.out.println("\nSize of chars: " + chars.size());
        System.out.println(chars.get(3));

        LinkedList<Float> floats2 = new LinkedList<>();
        floats2.add(5.6f);
        floats2.add(3.12f);
        floats2.add(18.3f);
        for (Float item : floats2) { System.out.print(item + "\t"); }
        System.out.println("\nSize of floats2: " + floats2.size());
    }
}
