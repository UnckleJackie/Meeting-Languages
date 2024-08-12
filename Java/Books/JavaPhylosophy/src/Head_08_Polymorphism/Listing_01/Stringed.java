package Head_08_Polymorphism.Listing_01;

import static Head_06_Access_Management.Block01.Print.print;

public class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        print("Adjusting Stringed");
    }
}
