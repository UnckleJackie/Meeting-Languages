package Head_08_Polymorphism.Listing_02;

import static Head_06_Access_Management.Block01.Print.print;

public class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        print("Circle.erase()");
    }
}
