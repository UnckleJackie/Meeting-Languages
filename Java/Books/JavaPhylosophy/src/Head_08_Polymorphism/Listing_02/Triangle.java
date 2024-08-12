package Head_08_Polymorphism.Listing_02;

import static Head_06_Access_Management.Block01.Print.print;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
}
