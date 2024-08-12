package Vasilyev_JavaForEverybody.Head_03;

public class Demo12 {
    public static void main(String[] args) {
        double[] a = new double[]{1, -3, 2, 4, 1, -1};
        double[] b = new double[a.length - 1];
        double x = 2.0, q = 1;
        double P = 0, Q = 0;
        for (int k = 0; k < b.length; k++) {
            P += a[k] * q;
            b[k] = (k + 1) * a[k + 1];
            Q += b[k] * q;
            q *= x;
        }
        P += a[a.length - 1] * q;
        System.out.println("Polynome P(x) = " + P);
        System.out.println("Производная P'(x) = " + Q);
    }
}
