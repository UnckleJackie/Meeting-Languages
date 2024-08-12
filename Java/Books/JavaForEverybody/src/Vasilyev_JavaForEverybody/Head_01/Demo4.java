package Vasilyev_JavaForEverybody.Head_01;

import static java.lang.Math.*;

public class Demo4 {
    public static void main(String[] args) {
        final double g = 9.8;
        double alpha = 30;
        double m = 0.1;
        double gamma = 0.1;
        double V = 100.0;
        double t = 1.0;
        double x, y;
        alpha /= 180 / PI;
        x = V * m * cos(alpha) / gamma * (1 - exp( -gamma * t / m));
        y = m * (V * sin(alpha) * gamma + m * g) / gamma / gamma * (1 - exp( -gamma * t / m)) - m * g * t / gamma;
        System.out.println("Coordinates body for t = " + t + " sec: \nx = " + x +
                " m\ny = " + y + " m");
        System.out.println("Parameters: ");
        System.out.println("Angle alpha = " + alpha / PI * 180 + " grad.");
        System.out.println("Velocity V = " + V + " m/s");
        System.out.println("Coefficient resisting gamma = " + gamma + " N*s/m");
        System.out.println("Mass of body m = " + m + " kg");
    }
}
