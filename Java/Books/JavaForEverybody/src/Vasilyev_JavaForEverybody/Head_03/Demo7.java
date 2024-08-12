package Vasilyev_JavaForEverybody.Head_03;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        System.out.println("Initial array");
        System.out.println(Arrays.toString(nums));
        Scanner input = new Scanner(System.in);
        System.out.print("Item index to deleting: ");
        int index = input.nextInt();
        if ((index >= 0) && (index < nums.length)) {
            int[] m = new int[nums.length - 1];
            for (int k = 0; k < index; k++) {
                m[k] = nums[k];
            }
            for (int k = index + 1; k < nums.length; k++) {
                m[k - 1] = nums[k];
            }
            nums = m;
        }
        System.out.println("After item deleting: ");
        System.out.println(Arrays.toString(nums));
    }
}
