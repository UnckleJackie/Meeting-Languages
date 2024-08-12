package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    public Glyph() {
        print("Glyph() before calling draw()");
        draw();
        print("Glyph() after calling draw()");
    }
}
