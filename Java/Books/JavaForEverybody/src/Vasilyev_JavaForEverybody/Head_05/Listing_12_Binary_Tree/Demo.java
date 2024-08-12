package Vasilyev_JavaForEverybody.Head_05.Listing_12_Binary_Tree;

public class Demo {
    public static void main(String[] args) {
        ObjectTree tree = new ObjectTree(4, 'A', 1);
        System.out.println("\tChecking objects tree");
        tree.FirstRef.SecondRef.FirstRef.show();
    }
}
