package Vasilyev_JavaForEverybody.Head_05.Listing_11;

public class Polynom {
    private int n;
    private double[] a;

    void set(double[] a) {
        this.n = a.length;
        this.a = new double[n];
        int i;
        for (i = 0; i < n; i++) {
            this.a[i] = a[i];
        }
    }

    void set(int n, double z) {
        this.n = n;
        this.a = new double[n];
        int i;
        for (i = 0; i < n; i++) {
            this.a[i] = z;
        }
    }

    void set(int n) {
        set(n, 0);
    }

    double value(double x) {
        double z = 0, q = 1;
        for (int i = 0; i < n; i++) {
            z += a[i] * q;
            q *= x;
        }
        return z;
    }

    void show() {
        int i;
        System.out.print("Degree x: ");
        for (i = 0; i < n - 1; i++) {
            System.out.printf("%6d", i);
        }
        System.out.printf("%6d\n", (n - 1));
        System.out.print("Coefficient: ");
        for (i = 0; i < n - 1; i++) {
            System.out.printf("%6.1f", a[i]);
        }
        System.out.printf("%6.1f\n", a[n - 1]);
    }

    void show(double x) {
        System.out.println("Value argument x = " + x);
        System.out.println("Polynom value P(x) = " + value(x));
    }

    Polynom diff() {
        Polynom t = new Polynom(n - 1);
        for (int i = 0; i < n - 1; i++) {
            t.a[i] = a[i + 1] * (i + 1);
        }
        return t;
    }

    Polynom diff(int k) {
        if (k >= n) return new Polynom(1);
        if (k > 0) return diff().diff(k - 1);
        else return new Polynom(a);
    }

    Polynom plus(Polynom Q) {
        Polynom t;
        int i;
        if (n >= Q.n) {
            t = new Polynom(a);
            for (i = 0; i < Q.n; i++) {
                t.a[i] += Q.a[i];
            }
        } else {
            t = new Polynom(Q.a);
            for (i = 0; i < n; i++) {
                t.a[i] += a[i];
            }
        }
        return t;
    }

    Polynom minus(Polynom Q) {
        return plus(Q.prod(-1));
    }

    Polynom div(double z) {
        return prod(1 / z);
    }

    Polynom prod(double z) {
        Polynom t = new Polynom(a);
        for (int i = 0; i < n; i++) {
            a[i] *= z;
        }
        return t;
    }

    Polynom prod(Polynom Q) {
        int N = n + Q.n - 1;
        Polynom t = new Polynom(N);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Q.n; j++) {
                t.a[i + j] += a[i] * Q.a[j];
            }
        }
        return t;
    }

    Polynom(double[] a) {
        set(a);
    }

    Polynom(int n, double z) {
        set(n, z);
    }

    Polynom(int n) {
        set(n);
    }
}
