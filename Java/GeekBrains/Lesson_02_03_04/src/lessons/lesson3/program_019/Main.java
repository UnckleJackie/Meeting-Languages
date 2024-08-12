package lessons.lesson3.program_019;

import lessons.Methods;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);

        for (int i : a) { System.out.printf("%d ", i); }
        for (int j : b) { System.out.printf("%d ", j); }

        a = new int[] { 0, 9 };
        System.out.println("\n");
        for (int i : a) {System.out.printf("%d ", i); }
        a = Methods.AddItem(a, 2);
        a = Methods.AddItem(a, 3);
        for (int j : a) {System.out.printf("%d ", j); }
    }
}
