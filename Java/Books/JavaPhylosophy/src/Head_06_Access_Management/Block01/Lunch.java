package Head_06_Access_Management.Block01;

public class Lunch {
    void testPrivate() {
        //! Soup1 soup = new Soup1();
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void ttestSingleton() {
        Soup2.access().f();
    }
}
