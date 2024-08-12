package seminars.sem1.task5;

import java.util.Random;

/**
 * apiNote Problem 1480 (leetcode) Given an array nums.
 * We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */
public class Main {
    public static void main(String[] args) {
        int arrayLength = new Random().nextInt(11) + 10;
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] result = new int[arr.length];
        result[0] = arr[0];
        System.out.print("[ ");
        for (int i = 1; i < result.length; i++) {
            result[i] += arr[i] + result[i - 1];
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}
