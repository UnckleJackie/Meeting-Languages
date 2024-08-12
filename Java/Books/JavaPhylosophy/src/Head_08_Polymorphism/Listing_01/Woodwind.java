package Head_08_Polymorphism.Listing_01;

import static Head_06_Access_Management.Block01.Print.print;

public class Woodwind extends Wind {
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }
}
