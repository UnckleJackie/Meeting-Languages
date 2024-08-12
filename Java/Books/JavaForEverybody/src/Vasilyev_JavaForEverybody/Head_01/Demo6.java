package Vasilyev_JavaForEverybody.Head_01;

import static java.lang.Math.*;

public class Demo6 {
    public static void main(String[] args) {
        final double G = 6.672E-11;
        final double M = 5.96e24;
        final double R = 6.37E6;
        double T = 1.5;
        double H;
        T *= 3600;
        H = pow(G * M * T * T / 4 / PI / PI, (double) 1 / 3) -R;
        H = (double) round(H) / 1000;
        System.out.println("Height of sputnik orbit: " + H + " km");
    }
}
