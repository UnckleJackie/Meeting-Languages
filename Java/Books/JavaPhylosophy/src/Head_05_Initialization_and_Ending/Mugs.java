package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        out.println("mug1 & mug2 initialized");
    }
    Mugs() {
        out.println("Mugs()");
    }
    Mugs(int i) {
        out.println("Mugs(int)");
    }
    public static void main (String[] args) {
        out.println("Im method main()");
        new Mugs();
        out.println("new Mugs() completed");
        new Mugs(1);
        out.println("new Mugs(1) completed");
    }
}
