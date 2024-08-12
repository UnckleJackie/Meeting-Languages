package Head_08_Polymorphism.Listing_02;

import static Head_06_Access_Management.Block01.Print.print;

public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
}
