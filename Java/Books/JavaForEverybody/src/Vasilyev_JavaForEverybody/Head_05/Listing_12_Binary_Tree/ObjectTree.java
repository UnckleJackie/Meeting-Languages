package Vasilyev_JavaForEverybody.Head_05.Listing_12_Binary_Tree;

public class ObjectTree {
    private static int IDnum = 8;
    private char Level;
    private int Number;
    private int[] ID;
    ObjectTree FirstRef;
    ObjectTree SecondRef;

    private void getID() {
        ID = new int[IDnum];
        for (int i = 0; i < IDnum; i++) {
            ID[i] = (int) (Math.random() * 10);
        }
    }

    private void showID() {
        for (int i = 0; i < IDnum; i++) {
            System.out.print("|" + ID[i]);
        }
        System.out.println("|");
    }

    void show() {
        System.out.println("Object level: \t" + Level);
        System.out.println("Number on level: \t" + Number);
        System.out.print("ID-code object: \t");
        showID();
    }

    ObjectTree(int k, char L, int n) {
        System.out.println("\tCreated new object!");
        Level = L;
        Number = n;
        getID();
        show();
        if (k == 1) {
            FirstRef = null;
            SecondRef = null;
        } else {
            FirstRef = new ObjectTree(k - 1, (char) (L + 1), 2 * n - 1);
            SecondRef = new ObjectTree(k - 1, (char) (L + 1), 2 * n);
        }
    }
}
