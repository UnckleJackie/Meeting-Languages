package Vasilyev_JavaForEverybody.Head_05.Listing_09;

public class MatrixExp {
    private final static int N = 100;
    private int n;
    private double[][] matrix;

    MatrixExp(int n, double Xmin, double Xmax) {
        double x = Math.abs(Xmax - Xmin);
        int i, j;
        this.n = n;
        matrix = new double[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = x * Math.random() + Xmin;
            }
        }
    }

    MatrixExp(double[][] matrix) {
        this.n = matrix[0].length;
        this.matrix = new double[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    MatrixExp(int n) {
        this.n = n;
        matrix = new double[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
            matrix[i][i] = 1;
            for (j = i + 1; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    MatrixExp(int n, double a) {
        this.n = n;
        matrix = new double[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = a;
            }
        }
    }

    void show() {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(Math.round(1000 * matrix[i][j]) / 1000.0 + "\t");
            }
            System.out.print(Math.round(1000 * matrix[i][n - 1]) / 1000.0 + "\n");
        }
    }

    MatrixExp sum(MatrixExp B) {
        MatrixExp t = new MatrixExp(n, 0);
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                t.matrix[i][j] = matrix[i][j] + B.matrix[i][j];
            }
        }
        return t;
    }

    MatrixExp prod(double x) {
        MatrixExp t = new MatrixExp(matrix);
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                t.matrix[i][j] *= x;
            }
        }
        return t;
    }

    MatrixExp prod(MatrixExp B) {
        MatrixExp t = new MatrixExp(n, 0);
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    t.matrix[i][j] += matrix[i][k] * B.matrix[k][j];
                }
            }
        }
        return t;
    }

    MatrixExp mExp() {
        MatrixExp t, q;
        t = new MatrixExp(n);
        q = new MatrixExp(matrix);
        int i;
        for (i = 1; i <= N; i++) {
            t = t.sum(q);
            q = q.prod(this).prod(1.0 / (i + 1));
        }
        return t;
    }
}
