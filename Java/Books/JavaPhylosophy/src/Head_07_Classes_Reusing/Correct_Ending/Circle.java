package Head_07_Classes_Reusing.Correct_Ending;

public class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Draw the circle Circle");
    }
    void dispose() {
        System.out.println("Dispose the circle Circle");
        super.dispose();
    }
}
