package program_012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int row = arr.length;
        int columns = arr[0].length;

        int totalSum = Integer.MIN_VALUE;



        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < columns - 2; j++) {
                int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (currentSum > totalSum) {
                    totalSum = currentSum;
                }
            }
        }
        System.out.println(totalSum);
        scanner.close();
    }
}
