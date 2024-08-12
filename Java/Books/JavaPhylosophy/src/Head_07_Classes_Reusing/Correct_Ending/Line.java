package Head_07_Classes_Reusing.Correct_Ending;

public class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Draw the line Line: " + start + ", " + end);
    }
    void dispose() {
        System.out.println("Dispose the line Line: " + start + ", " + end);
        super.dispose();
    }
}
