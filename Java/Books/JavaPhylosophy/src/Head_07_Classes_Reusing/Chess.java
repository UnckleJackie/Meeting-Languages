package Head_07_Classes_Reusing;

import static Head_06_Access_Management.Block01.Print.print;

public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Constructor Chess");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
