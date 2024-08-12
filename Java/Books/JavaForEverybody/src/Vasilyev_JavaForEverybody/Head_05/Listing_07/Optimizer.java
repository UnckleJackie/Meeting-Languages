package Vasilyev_JavaForEverybody.Head_05.Listing_07;

public class Optimizer {
    private int n;
    private double a, b;
    double[][] data;

    private double psi(int k, double x) {
        int i;
        double s = 1;
        for (i = 0; i < k; i++) {
            s *= (x - data[0][i]) / (data[0][k] - data[0][i]);
        }
        for (i = k + 1; i <= n; i++) {
            s *= (x - data[0][i]) / (data[0][k] - data[0][i]);
        }
        return s;
    }

    private void set() {
        double Sxy = 0, Sx = 0, Sy = 0, Sxx = 0;
        for (int i = 0; i <= n; i++) {
            Sx += data[0][i];
            Sy += data[1][i];
            Sxx += data[0][i] * data[0][i];
            Sxy += data[0][i] * data[1][i];
        }
        a = ((n + 1) * Sxy - Sx * Sy) / ((n + 1) * Sxx - Sx * Sx);
        b = Sy / (n + 1) - a / (n + 1) * Sx;
    }

    double approx(double x) {
        return a * x + b;
    }

    double interp(double x) {
        double s = 0;
        for (int i = 0; i <= n; i++) {
            s += data[1][i] * psi(i, x);
        }
        return s;
    }

    Optimizer(int n) {
        this.n = n;
        data = new double[2][n + 1];
        for (int i = 0; i <= n; i++) {
            data[0][i] = Math.PI * i / n / 2;
            data[1][i] = Math.sin(data[0][i]);
        }
        set();
    }
}
