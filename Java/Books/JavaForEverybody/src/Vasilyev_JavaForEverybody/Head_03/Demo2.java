package Vasilyev_JavaForEverybody.Head_03;

public class Demo2 {
    public static void main(String[] args) {
        int i, j, n = 3, val = 1;
        int[][] nums = new int[n - 1][n];
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n; j++) {
                nums[i][j] = val++;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
