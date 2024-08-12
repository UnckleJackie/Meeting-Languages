package Vasilyev_JavaForEverybody.Head_05.Listing_11;

public class Demo {
    public static void main(String[] args) {
        double[] coefs = new double[] {3, -2, -1, 0, 1};
        Polynom P = new Polynom(coefs);
        System.out.println("\tCoefficients initial Polynom: ");
        P.show();
        System.out.println("\tValue polynom at point: ");
        P.show(1);
        System.out.println("\tSecond производная: ");
        Polynom Q = P.diff(2);
        Q.show();
        System.out.println("\tSum of polynoms: ");
        Q.plus(P).show();
        System.out.println("\tPolynoms production: ");
        Q.prod(P).show();
    }
}
