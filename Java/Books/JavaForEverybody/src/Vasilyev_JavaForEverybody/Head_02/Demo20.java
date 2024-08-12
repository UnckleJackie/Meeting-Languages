package Vasilyev_JavaForEverybody.Head_02;

import static java.lang.Math.*;

public class Demo20 {
    public static void main(String[] args) {
        final double g = 9.8;
        double m = 0.1;
        double V = 100;
        double alpha = 60;
        double H1 = 100, H2 = 300;
        double gamma1 = 0.0001, gamma2 = 0.0001;
        double dt = 1E-6;
        double Xn = 0, Yn = 0, Vn, Un;
        double Fx, Fy;
        double Tmax, Smax, Hmax = 0;
        int height;
        alpha = toRadians(alpha);
        Vn = V * cos(alpha);
        Un = V * sin(alpha);
        for (int n = 1; true; n++) {
            Yn += Un * dt;
            if (Yn < 0) {
                Tmax = round((n - 1) * dt * 100) / 100.0;
                Smax = round(Xn * 100) / 100.0;
                Hmax = round(Hmax * 100) / 100.0;
                break;
            }
            Xn += Vn * dt;
            if (Yn > Hmax) Hmax = Yn;
            height = Yn < H1 ? 1 : Yn < H2 ? 2 : 3;
            switch (height) {
                case 1:
                    Fx = gamma1 * Vn * sqrt(Vn * Vn + Un * Un);
                    Fy = gamma1 * Un * sqrt(Vn * Vn + Un * Un);
                    break;
                case 2:
                    Fx = gamma2 * Vn;
                    Fy = gamma2 * Un;
                    break;
                default:
                    Fx = 0;
                    Fy = 0;
            }
            Vn += -Fx * dt / m;
            Un += -g * dt - Fy * dt / m;
        }
        System.out.println("Flying time of body Tmax = " + Tmax + " seconds");
        System.out.println("Flying length of body Smax = " + Smax + " meters");
        System.out.println("Max flying height of body Hmax = " + Hmax + " meters");
    }
}
