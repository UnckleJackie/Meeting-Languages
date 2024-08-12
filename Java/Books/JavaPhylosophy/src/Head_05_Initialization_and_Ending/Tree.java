package Head_05_Initialization_and_Ending;

import static java.lang.System.out;

public class Tree {
    int height;
    Tree() {
        out.println("Plant a sprout");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        out.println("Creating new tree, height " + height + " mt.");
    }
    void info() {
        out.println("Height of Tree: " + height + " mt.");
    }
    void info(String s) {
        out.println(s + ": Height of Tree: " + height + " mt.");
    }
}
