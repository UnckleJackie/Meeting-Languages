package Vasilyev_JavaForEverybody.Head_13;

public class Demo7 {
    public static void main(String[] args) {
        char[] symbs = {'A', 'B', 'C', 'D'};
        int[][] nums = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (char s : symbs) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (int[] p : nums) {
            for (int n : p) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
