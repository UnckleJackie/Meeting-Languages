package Head_07_Classes_Reusing;

import static Head_06_Access_Management.Block01.Print.print;

public class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("Constructor BoardGame");
    }
}
