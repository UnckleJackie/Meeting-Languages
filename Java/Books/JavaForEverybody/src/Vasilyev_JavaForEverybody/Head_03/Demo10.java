package Vasilyev_JavaForEverybody.Head_03;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        double[] a = { 1, 2, -1 };
        double[] b = { 3, -1, 2 };
        double[] c = new double[3];
        double s = 0;
        for (int k = 0; k < 3; k++) {
            s += a[k] * b[k];
            c[k] = a[(k + 1) % 3] * b[(k + 2) % 3] - a[(k + 2) % 3] * b[(k + 1) % 3];
        }
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("a.b = " + s);
        System.out.println("c = [a.b] = " + Arrays.toString(c));
    }
}
