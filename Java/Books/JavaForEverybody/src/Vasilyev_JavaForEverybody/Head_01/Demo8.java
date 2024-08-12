package Vasilyev_JavaForEverybody.Head_01;

import static java.lang.Math.*;

public class Demo8 {
    public static void main(String[] args) {
        final double g = 9.8;
        double V = 10;
        double alpha = 30;
        double t = 5;
        double T0, T, x, y;
        alpha = toRadians(alpha);
        T0 = 2 * V * Math.sin(alpha) / g;
        T = T0 * floor(t/T0);
        x = V * cos(alpha) * t;
        y = V * sin(alpha) * (t - T) - g * (t - T) * (t - T) / 2;
        x = round(100 * x) / 100.0;
        y = round(100 * y) / 100.0;
        System.out.println("x(" + t + ") = " + x + " m");
        System.out.println("y(" + t + ") = " + y + " m");
    }
}
