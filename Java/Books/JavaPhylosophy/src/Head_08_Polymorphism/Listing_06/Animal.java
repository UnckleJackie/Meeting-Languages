package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("animal, not plant");

    Animal() {
        print("Animal()");
    }

    protected void dispose() {
        print("dispose() in Animal ");
        t.dispose();
        p.dispose();
    }
}
