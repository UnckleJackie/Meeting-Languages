package Vasilyev_JavaForEverybody.Head_05.Listing_10;

public class Demo {
    public static void main(String[] args) {
        Vector a = new Vector(1, 0, 0);
        Vector b = new Vector(new double[]{0, 1, 0});
        Vector c;
        System.out.println("Vector production: ");
        (c = a.vprod(b)).showln();
        System.out.println("Multi production: " + a.mprod(b, c));
        System.out.println("Linear vector combination: ");
        a.prod(3).plus(b.div(2)).minus(c).showln();
        a.set(4, 0, -3);
        b.set(0, 10, 0);
        System.out.println("Angle between vectors (degrees): " + a.angDeg(b));
        System.out.println("Parallelogram square: " + a.square(b));
    }
}
