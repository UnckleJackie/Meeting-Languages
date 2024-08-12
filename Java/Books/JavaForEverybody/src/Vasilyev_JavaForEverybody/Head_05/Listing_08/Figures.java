package Vasilyev_JavaForEverybody.Head_05.Listing_08;

public class Figures {
    private int n;
    private Point[] points;

    Figures(int n, double x, double y) {
        double phi0, phi, r;
        Point p = new Point('A', x, y);
        int i;
        this.n = n;
        points = new Point[n];
        phi0 = Math.atan2(y, x);
        phi = 2 * Math.PI / n;
        r = p.dist();
        System.out.print("Equal " + n + "-angle with ups in points ");
        for (i = 0; i < n - 1; i++) {
            p.show();
            System.out.print(i == n - 2 ? " and " : ", ");
            points[i] = p;
            p = new Point(
                    (char) (p.name + 1),
                    r * Math.cos(phi0 + (i + 1) * phi),
                    r * Math.sin(phi0 + (i + 1) * phi)
            );
        }
        points[n - 1] = p;
        p.show();
        System.out.println();
        System.out.println("Perimeter: \t" + perimeter());
        System.out.println("Square:\t" + square());
    }

    double dist(Point A, Point B) {
        return Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
    }

    double perimeter() {
        double P = 0;
        int i;
        for (i = 0; i < n - 1; i++) {
            P += dist(points[i], points[i + 1]);
        }
        P += dist(points[n - 1], points[0]);
        return P;
    }

    double square() {
        double r = points[0].dist();
        double phi = 2 * Math.PI / n;
        double s = r * r * Math.sin(phi) / 2;
        return s * n;
    }
}
