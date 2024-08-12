package Vasilyev_JavaForEverybody.Head_03;

public class Demo1 {
    public static void main(String[] args) {
        int i, n;
        int[] data;
        data = new int[] { 3, 8, 1, 7 };
        n = data.length;
        int[] nums = new int[n];
        for (i = 0; i < nums.length; i++) {
            nums[i] = 2 * data[i] - 3;
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
    }
}
