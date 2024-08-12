package Head_08_Polymorphism.Listing_01;

import static Head_06_Access_Management.Block01.Print.print;

public class Brass extends Wind {
    public void play(Note n) {
        print("Brass.play() " + n);
    }

    void adjust() {
        print("Adjusting Brass");
    }
}
