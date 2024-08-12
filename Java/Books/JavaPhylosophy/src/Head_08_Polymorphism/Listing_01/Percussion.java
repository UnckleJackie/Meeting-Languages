package Head_08_Polymorphism.Listing_01;

import static Head_06_Access_Management.Block01.Print.print;

public class Percussion extends Instrument {
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        print("Adjusting Percussion");
    }
}
