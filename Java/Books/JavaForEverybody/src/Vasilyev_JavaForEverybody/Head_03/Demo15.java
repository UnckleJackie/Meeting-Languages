package Vasilyev_JavaForEverybody.Head_03;

import static java.lang.Math.random;

public class Demo15 {
    public static void main(String[] args) {
        int n = 4;
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];
        int i, j, k;
        System.out.println("Matrix A: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = (int)(20 * random() - 9);
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix B: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                B[i][j] = (int)(20 * random() - 9);
                System.out.printf("%4d", B[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix C = AB: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                C[i][j] = 0;
                for (k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.printf("%4d", C[i][j]);
            }
            System.out.println();
        }
    }
}
