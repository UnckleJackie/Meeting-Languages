package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class LivingCreature {
    private Characteristic p = new Characteristic("Living creature");
    private Description t = new Description("usual living creature");

    LivingCreature() {
        print("LivingCreature()");
    }

    protected void dispose() {
        print("dispose() in LivingCreature ");
        t.dispose();
        p.dispose();
    }
}
