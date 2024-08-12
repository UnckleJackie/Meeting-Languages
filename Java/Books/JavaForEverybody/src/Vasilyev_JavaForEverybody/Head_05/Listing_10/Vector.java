package Vasilyev_JavaForEverybody.Head_05.Listing_10;

public class Vector {
    private double[] vect = new double[3];

    void set(double x, double y, double z) {
        vect[0] = x;
        vect[1] = y;
        vect[2] = z;
    }

    void set(double[] params) {
        for (int i = 0; i < 3; i++) {
            vect[1] = params[i];
        }
    }

    void set() {
        set(0, 0, 0);
    }

    void show() {
        double[] x = new double[3];
        for (int i = 0; i < 3; i++) {
            x[i] = Math.round(vect[i] * 100) / 100.0;
        }
        System.out.print("<" + x[0] + "|" + x[1] + "|" + x[2] + ">");
    }

    void showln() {
        show();
        System.out.println();
    }

    Vector plus(Vector b) {
        Vector t = new Vector();
        for (int i = 0; i < 3; i++) {
            t.vect[i] = vect[i] + b.vect[i];
        }
        return t;
    }

    Vector minus(Vector b) {
        Vector t = new Vector();
        for (int i = 0; i < 3; i++) {
            t.vect[i] = vect[i] - b.vect[i];
        }
        return t;
    }

    Vector prod(double x) {
        Vector t = new Vector();
        for (int i = 0; i < 3; i++) {
            t.vect[i] = vect[i] * x;
        }
        return t;
    }

    double prod(Vector b) {
        double x = 0;
        for (int i = 0; i < 3; i++) {
            x += vect[i] * b.vect[i];
        }
        return x;
    }

    Vector vprod(Vector b) {
        Vector t = new Vector();
        for (int i = 0; i < 3; i++) {
            t.vect[i] = vect[(i + 1) % 3] * b.vect[(i + 2) % 3] -
                    vect[(i + 2) % 3] * b.vect[(i + 1) % 3];
        }
        return t;
    }

    double mprod(Vector b, Vector c) {
        return vprod(b).prod(c);
    }

    Vector div(double x) {
        Vector t = new Vector();
        for (int i = 0; i < 3; i++) {
            t.vect[i] = vect[i] / x;
        }
        return t;
    }

    double module() {
        return Math.sqrt(prod(this));
    }

    double ang(Vector b) {
        double z;
        z = prod(b) / module() / b.module();
        return Math.acos(z);
    }

    double angDeg(Vector b) {
        return Math.toDegrees(ang(b));
    }

    double square(Vector b) {
        Vector t;
        t = vprod(b);
        return t.module();
    }

    Vector(double[] params) {
        set(params);
    }

    Vector(double x, double y, double z) {
        set(x, y, z);
    }

    Vector() {
        set();
    }
}
