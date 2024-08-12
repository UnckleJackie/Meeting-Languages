package Head_08_Polymorphism.Listing_01;

import static Head_06_Access_Management.Block01.Print.print;

public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        print("Adjusting Wind");
    }
}
