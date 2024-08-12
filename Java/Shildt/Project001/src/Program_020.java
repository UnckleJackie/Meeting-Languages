public class Program_020 {
    public static void main (String[] args) {
        Main.title("extended cycle for");
        System.out.println("\tSearch in array:");
        int[] nums = {6 , 8 , 3, 7, 5, 6, 1, 4, 12, 19, 4, 8, 12, 2, 13, 7};
        int val = 5;
        int position = -1;
        boolean found = false;
        // Apply cycle for-each for searching val in nums
        for (int x : nums) {
            if (x == val) {
                found = true;
                // position = nums[val];
                break;
            }
        }
        if (found)
            System.out.println(val + " is found\n\n\tLocal variables:\n");
        for (var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + "\t");
        System.out.println();
        System.out.print("Values in array nums:\n");
        for (var v : nums)
            System.out.print(v + "\t");
        System.out.println("\n\n\tNested cycles:\n");
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++)
                System.out.print(".");
                System.out.println();
        }
    }
}
