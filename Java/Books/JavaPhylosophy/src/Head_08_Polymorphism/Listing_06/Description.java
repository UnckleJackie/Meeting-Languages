package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Description {
    private String s;

    Description(String s) {
        this.s = s;
        print("Create Description " + s);
    }

    protected void dispose() {
        print("Finish Description " + s);
    }
}
