package Vasilyev_JavaForEverybody.Head_03;

public class Demo3 {
    public static void main(String[] args) {
        int i, j, val = 1;
        int[][] nums = new int[19][];
        for (i = 0; i < nums.length; i++) {
            nums[i] = new int[i + 1];
        }
        for (i = 0; i < nums.length; i++) {
            for (j = 0; j < nums[i].length; j++) {
                nums[i][j] = val++;
                if(nums[i][j] < 10) {
                    System.out.print("00" + nums[i][j] + " ");
                } else if(nums[i][j] >= 10 && nums[i][j] < 100) {
                    System.out.print("0" + nums[i][j] + " ");
                } else {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
