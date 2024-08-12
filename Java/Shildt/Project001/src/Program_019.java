public class Program_019 {
    public static void main (String[] args) {
        Main.title("for-each cycle");
        System.out.println("for (variable type : collection) body\n\n" +
                "for example the difference:\n" +
                "\tint[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };\n" +
                "\tint sum = 0;\n" +
                "\tfor (int i = 0; i < 10; i++) sum += nums[i];\nor\n" +
                "\tint[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };\n" +
                "\tint sum = 0;\n" +
                "\tfor (int x: nums) sum += x;\n\n");
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int x : nums) {
            System.out.print("x = " + x + "\t");
            sum += x;
        }
        System.out.println("\nSumma = " + sum + "\n\nwith operator break:\n");

        sum = 0;
        for (int x: nums) {
            System.out.print("x = " + x + "\t");
            sum += x;
            if (x == 5) break;
        }
        System.out.println("\nSum of the first five items is " + sum + "\n\n" +
                "Variable in for-each cycle is accepted only for reading!!!\n");
        for (int x : nums) {
            System.out.print(x + "\t");
            x = x * 10; // doesn't influence to nums
        }
        System.out.println();
        for (int x : nums)
            System.out.print(x + "\t");
        System.out.println("\n-----Passage in many-measured arrays-----\n");

        sum = 0;
        int[][] nums2 = new int[3][5];
        for (int i = 0; i < 3; i++)     // Saving to nums array of values
            for (int j = 0; j < 5; j++)
                nums2[i][j] = (i + 1) * (j + 1);
        // Apply for-each cycle for display and sum of values
        for (int[] x : nums2) {
            for (int y : x) {
                System.out.print(y + "\t");
                sum += y;
            }
        }
        System.out.println("\nSum is " + sum);
    }
}
