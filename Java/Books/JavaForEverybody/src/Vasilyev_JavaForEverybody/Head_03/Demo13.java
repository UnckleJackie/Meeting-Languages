package Vasilyev_JavaForEverybody.Head_03;

import static java.lang.Math.random;

public class Demo13 {
    public static void main(String[] args) {
        int n = 15, s;
        int[] nums = new int[n];
        System.out.println("Initial array: ");
        for (int k = 0; k < nums.length; k++) {
            nums[k] = (int)(5 * n * random());
            System.out.print(nums[k] + " ");
        }
        for (int m = 1; m < nums.length; m++) {
            for (int k = 0; k < nums.length - m; k++) {
                if (nums[k] > nums[k + 1]) {
                    s = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = s;
                }
            }
        }
        System.out.println("\nArray after sorting: ");
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }
}
