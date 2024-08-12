package Vasilyev_JavaForEverybody.Head_02;

public class Demo18 {
    public static void main(String[] args) {
        double x0 = 0;
        double x, f;
        double epsilon = 1E-10;
        int Nmax = 1000;
        int n = 0;
        f = x0;
        do {
            n++;
            x = f;
            f = (x * x + 10) / 7;
        } while ((n <= Nmax) && (Math.abs(x - f) > epsilon));
        x = f;
        System.out.println("Equation solving: ");
        System.out.println("x = " + x);
        System.out.println("Number of iterations: " + (n + 1));
    }
}
