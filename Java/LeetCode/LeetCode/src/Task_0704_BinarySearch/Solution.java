package Task_0704_BinarySearch;

public class Solution {
        public static void main(String[] args) {
        int[] nums1 = { -1, 0, 3, 5, 9, 12 };
        int target1 = 9;
        int target2 = 2;
        System.out.println(search(nums1, target1));
        System.out.println(search(nums1, target2));
        System.out.println();
        System.out.println(search2(nums1, target1));
        System.out.println(search2(nums1, target2));
    }
    /**
     * @apiNote https://leetcode.com/problems/binary-search/description/
     * Given an array of integers nums which is sorted in ascending order,
     * and an integer target, write a function to search target in nums.
     * If target exists, then return its index. Otherwise, return -1.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     * @param nums
     * @param target
     * @return
     */
    private static int search2(int[] nums, int target) {
        int length = nums.length;
        int begin = 0;
        int end = length - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            else if (target > nums[mid]) {
                begin = mid + 1;
            }
            else end = mid - 1;
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        return rec(nums, target, left, right);
    }
    private static int rec(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return rec(nums, target, mid + 1, right);
        } else {
            return rec(nums, target, left, mid - 1);
        }
    }
}
