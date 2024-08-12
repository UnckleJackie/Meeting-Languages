package Head_07_Classes_Reusing.Final;

public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmp(); // ERROR -- g is final
    }
    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }
    // void f(final int i) { i++; }
    int g(final int i) {
        return i + 1;
    }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
