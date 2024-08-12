package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("in water, and in land");

    Amphibian() {
        print("Amphibian()");
    }

    protected void dispose() {
        print("dispose() in Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
