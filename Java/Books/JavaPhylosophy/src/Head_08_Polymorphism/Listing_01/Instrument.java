package Head_08_Polymorphism.Listing_01;

import static Head_06_Access_Management.Block01.Print.print;

public class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }
}
