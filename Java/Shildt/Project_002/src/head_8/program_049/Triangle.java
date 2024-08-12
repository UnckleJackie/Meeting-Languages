package head_8.program_049;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Inside area() for Triangle.");
        return dim1 * dim2 / 2;
    }
}
