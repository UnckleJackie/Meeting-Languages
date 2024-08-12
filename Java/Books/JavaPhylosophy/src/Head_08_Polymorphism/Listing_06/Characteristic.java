package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        print("Create Characteristic " + s);
    }

    protected void dispose() {
        print("Finish Characteristic " + s);
    }
}
