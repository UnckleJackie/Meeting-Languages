package Head_07_Classes_Reusing;

import static Head_06_Access_Management.Block01.Print.print;

public class Soap {
    private String s;
    Soap() {
        print("Soap()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}
