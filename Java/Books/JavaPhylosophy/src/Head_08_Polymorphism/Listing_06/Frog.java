package Head_08_Polymorphism.Listing_06;

import static Head_06_Access_Management.Block01.Print.print;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("kwa - kwa");
    private Description t = new Description("eat beatles");

    public Frog() {
        print("Frog()");
    }

    protected void dispose() {
        print("Finish Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye!");
        frog.dispose();
    }
}
