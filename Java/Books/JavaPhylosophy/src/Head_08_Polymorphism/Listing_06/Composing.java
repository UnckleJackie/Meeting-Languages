package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Create " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}
