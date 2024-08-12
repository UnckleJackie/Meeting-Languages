package Vasilyev_JavaForEverybody.Head_01;

public class Demo5 {
    public static void main(String[] args) {
        double S1 = 100;
        double S2 = 200;
        double V1 = 80;
        double V = 48;
        double V2, T, t;
        T = (S1 + S2) / V;
        t = S1 / V1;
        V2 = T > t ? (S1 + S2) / (T - t) : -1;
        System.out.println("Velocity at the second line: ");
        System.out.println(V2 < 0 ? "That's impossible!" : V2 + "km/h");
    }
}
