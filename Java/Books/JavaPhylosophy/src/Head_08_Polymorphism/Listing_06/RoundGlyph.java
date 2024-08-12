package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    public void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}
