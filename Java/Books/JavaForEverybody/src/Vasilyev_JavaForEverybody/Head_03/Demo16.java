package Vasilyev_JavaForEverybody.Head_03;

public class Demo16 {
    public static void main(String[] args) {
        int N = 100;
        int M = 5;
        int n = 200;
        int count;
        double q = 0.57, dq = 0.01;
        int[][] A = new int[n][n];
        double[][] P = new double[2][M + 1];
        int i, j, k, m;
        for (m = 0; m <= M; m++) {
            P[0][m] = q + dq * m;
        }
        for(m = 0; m <= M; m++) {
            P[1][m] = 0;
            for (k = 1; k <= N; k++) {
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        if (Math.random() > P[0][m]) {
                            A[i][j] = 1;
                        } else {
                            A[i][j] = 0;
                        }
                    }
                }
                for (i = 0; i < n; i++) {
                    if (A[i][0] == 0) {
                        A[i][0] = 2;
                    }
                }
                do {
                    count = 0;
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            if (A[i][j] == 2) {
                                if (i > 0 && A[i - 1][j] == 0) {
                                    A[i - 1][j] = 2;
                                    count++;
                                }
                                if (i < n -1 && A[i + 1][j] == 0) {
                                    A[i + 1][j] = 2;
                                    count++;
                                }
                                if (j < n - 1 && A[i][j + 1] == 0) {
                                    A[i][j + 1] = 2;
                                    count++;
                                }
                                if (j > 0 && A[i][j - 1] == 0) {
                                    A[i][j - 1] = 2;
                                    count++;
                                }
                            }
                        }
                    }
                } while (count > 0);
                for (i = 0; i < n; i++) {
                    if (A[i][n - 1] == 2) {
                        P[1][m] += (double) 1 / N;
                        break;
                    }
                }
            }
        }
        System.out.print("Leaking nod \t\t");
        for (m = 0; m <= M; m++) {
            System.out.printf("%7.2f", Math.round(P[0][m] * 100) / 100.0);
        }
        System.out.print("\nLeaking of сетки\t");
        for (m = 0; m <= M; m++) {
            System.out.printf("%7.2f", Math.round(P[1][m] * 100) / 100.0);
        }
        System.out.println();
    }
}
