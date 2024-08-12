package Tasks_0001_0050.Task_0004_MedianOfTwoSortedArrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        int[] nums3 = {1, 3, 5};
        int[] nums4 = {1, 3, 5, 7, 8};
        int[] nums5 = {1, 3};
        int[] nums6 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        System.out.println(findMedianSortedArrays(nums3, nums4));
        System.out.println(findMedianSortedArrays(nums5, nums6));
    }

    /** @apiNote https://leetcode.com/problems/median-of-two-sorted-arrays/description/
     * Given two sorted arrays nums1 and nums2 of size m and n respectively,
     * return the median of the two sorted arrays.
     * The overall run time complexity should be O(log (m+n)).
     *      Example 1:
     * Input: nums1 = [1,3], nums2 = [2]
     * Output: 2.00000
     * Explanation: merged array = [1,2,3] and median is 2.
     *      Example 2:
     * Input: nums1 = [1,2], nums2 = [3,4]
     * Output: 2.50000
     * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {    // replacement arrays if nums1 > nums2
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            m = nums1.length;
            n = nums2.length;
        }
        int imin = 0;   // init variables for median bynary search
        int imax = m;
        int half_len = (m + n + 1) / 2;

        while (imin <= imax) {
            int i = (imin + imax) / 2;  // divide nums1 to 2 parts at i point
            int j = half_len - i;
            if (i < m && nums2[j - 1] > nums1[i]) {
                imin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                imax = i - 1;
            } else {
                int lmax = 0;
                if (i == 0) {
                    lmax = nums2[j - 1];
                } else if (j == 0) {
                    lmax = nums1[i - 1];
                } else {
                    lmax = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return lmax;
                }
                int rmin = 0;
                if (i == m) {
                    rmin = nums2[j];
                } else if (j == n) {
                    rmin = nums1[i];
                } else {
                    rmin = Math.min(nums1[i], nums2[j]);
                }
                return (lmax + rmin) / 2.0;
            }
        }
        return 0.0;
    }
}
