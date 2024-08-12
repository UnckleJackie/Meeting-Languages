package head_8.program_051;
abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    // Now area() is abstract method
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    // Переопределить area() for Rectangle
    double area() {
        System.out.println("Inside area() for Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    // Redefine area() for rect Triangle
    double area() {
        System.out.println("Inside area() for Triangle");
        return dim1 * dim2 / 2;
    }
}
public class AbstractAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10, 10); // Not available now
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}