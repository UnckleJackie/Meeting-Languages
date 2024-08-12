package Head_07_Classes_Reusing.Final;

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
        //! op.f();
        //! op.g();
        //! wf.f();
        //! wf.g();
    }
}
