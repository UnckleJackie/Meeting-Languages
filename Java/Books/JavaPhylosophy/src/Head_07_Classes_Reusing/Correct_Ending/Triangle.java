package Head_07_Classes_Reusing.Correct_Ending;

public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Draw the triangle Triangle");
    }
    void dispose() {
        System.out.println("Dispose the triangle Triangle");
    }
}
