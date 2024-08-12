package Head_08_Polymorphism.Listing_03;

import static Head_06_Access_Management.Block01.Print.print;

public class PrivateOverride {
    private void f() {
        print("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}
