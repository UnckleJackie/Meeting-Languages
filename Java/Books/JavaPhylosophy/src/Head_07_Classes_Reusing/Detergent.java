package Head_07_Classes_Reusing;

import static Head_06_Access_Management.Block01.Print.print;

public class Detergent extends Cleaner {
    public void scrub() {
        append(" Detergernt.scrub()");
        super.scrub();
    }
    public void foam() {
        append(" foam()");
    }
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Check basic class");
        Cleaner.main(args);
    }
}
