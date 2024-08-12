package Head_07_Classes_Reusing;

import static Head_06_Access_Management.Block01.Print.print;

public class Cartoon extends Drawing {
    public Cartoon() {
        print("Constructor Cartoon");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
