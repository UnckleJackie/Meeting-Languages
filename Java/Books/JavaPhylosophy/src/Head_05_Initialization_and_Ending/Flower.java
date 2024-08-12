package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        out.println("Constructor with int parameter, petalCount = " + petalCount);
    }
    Flower(String ss) {
        out.println("Constructor with string parameter, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
        //! this(s); // Calling another constructor is denied!
        this.s = s; // Another using this
        out.println("Arguments String and int");
    }
    Flower() {
        this("hi", 47);
        out.println("Default constructor");
    }
    void printPetalCount() {
        //! htis(11); // Only ib constructors allowed!
        out.println("petalCount = " + petalCount + " s = " + s);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
