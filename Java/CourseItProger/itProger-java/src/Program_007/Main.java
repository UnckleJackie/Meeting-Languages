package Program_007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 3;
        nums[2] = -834;
        nums[3] = 138;
        nums[4] = 11;
        int res = nums[2] + nums[3];
        System.out.println(res);
        System.out.println(nums[3]);

        float[] nums2 = new float[] { 5.0f, 6.45f, 89.9584f };
        System.out.println(nums2[2]);

        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Item " + i + ": " + nums2[i]);
        }
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number: ");
            int value = scanner.nextInt();
            arr[i]=  value;
        }
        int min = arr[0];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Minimal: " + min + " at " + index + " position");

        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums3 = new byte[][] {
                { 5, 7 },
                { 12, 2 },
                { 2, 0 }
        };
        System.out.println(nums3[1][1]);

        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + "\t");
            for (int j = 0; j < nums3[i].length; j++) {
                System.out.print(nums3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
