package Vasilyev_JavaForEverybody.Head_04.Matrix;

public class Matrix {
    private int n;
    private int[][] matrix;

    void create(int n) {
        this.n = n;
        matrix = new int[n][n];
    }

    void rand() {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    void value(int a) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = a;
            }
        }
    }

    void digits() {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = (i * n + j) % 9 + 1;
            }
        }
    }

    void unit() {
        int i;
        value(0);
        for (i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
    }

    int trace() {
        int i, s = 0;
        for (i = 0; i < n; i++) {
            s += matrix[i][i];
        }
        return s;
    }

    int det() {
        int D = 0;
        switch (n) {
            case 1:
                D = matrix[0][0];
                break;
            case 2:
                D = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
                break;
            default:
                int i, j, k, sign = 1;
                Matrix m;
                for (k = 0; k < n; k++) {
                    m = new Matrix();
                    m.create(n - 1);
                    for (i = 1; i < n; i++) {
                        for (j = 0; j < k; j++) {
                            m.matrix[i - 1][j] = matrix[i][j];
                        }
                        for (j = k + 1; j < n; j++) {
                            m.matrix[i - 1][j - 1] = matrix[i][j];
                        }
                    }
                    D += sign * matrix[0][k] * m.det();
                    sign *= (-1);
                }
        }
        return D;
    }

    void trans() {
        int i, j, s;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                s = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = s;
            }
        }
    }

    void show() {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
