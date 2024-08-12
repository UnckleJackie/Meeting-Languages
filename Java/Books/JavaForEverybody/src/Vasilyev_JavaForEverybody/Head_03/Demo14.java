package Vasilyev_JavaForEverybody.Head_03;

import static java.lang.Math.random;

public class Demo14 {
    public static void main(String[] args) {
        int n = 4;
        int[][] A = new int[n][n];
        int i, j, tmp;
        System.out.println("Matrix before transponire: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = (int)(10 * random());
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
        System.out.println("Matrix after transponire: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
