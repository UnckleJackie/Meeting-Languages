package program_020;

public class Main {
    public static void main(String[] args) {


        Rectangle rect = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(52, 102);
        Rectangle rect3 = new Rectangle(10, 102);
        System.out.println(rect.calcArea());
        System.out.println(rect2.calcArea());
        System.out.println(rect3.calcArea());
    }
}
