package Tasks_0001_0050.Task_0001_TwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = new int[new Random().nextInt(20)];
        int target1 = new Random().nextInt(15);
        System.out.println("target = " + target1);
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = new Random().nextInt(10) + 1;
            System.out.print(nums1[i] + ", ");
        }
        int[] twoSum = twoSum(nums1, target1);
        System.out.print("\n[ ");
        for (int i = 0; i < twoSum.length; i++) {
            if (twoSum != null) {
                System.out.print(twoSum[i] + " ");
            } else {
                System.out.print("null ");
            }
        }
        System.out.print("]");
    }

    /**
     * @apiNote Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     *
     * You can return the answer in any order.
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
