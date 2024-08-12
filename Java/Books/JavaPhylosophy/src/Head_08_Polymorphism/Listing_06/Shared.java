package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Create " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}
