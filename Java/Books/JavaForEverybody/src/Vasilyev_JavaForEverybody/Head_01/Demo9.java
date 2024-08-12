package Vasilyev_JavaForEverybody.Head_01;

import static java.lang.Math.asin;
import static java.lang.Math.sqrt;

public class Demo9 {
    public static void main(String[] args) {
        double a = 5;
        double b = 3;
        double c = 1;
        double alpha;
        boolean state; // Logic var - criterion of available solves
        alpha = asin(a / sqrt(a * a + b * b));
        state = a * a + b * b >= c * c;
        System.out.println("Equation a * cos(x) + b * sin(x) = c");
        System.out.println("Parameters: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.print("Solving for x: ");
        System.out.println(state ? asin(c / sqrt(a * a + b * b)) - alpha : "There are no solves!");
    }
}
