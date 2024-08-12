package head_9.program_054.p2;

public class OtherPackage {
    OtherPackage() {
        head_9.program_054.p1.Protection p = new head_9.program_054.p1.Protection();
        System.out.println("Constructor class from other package");
        // System.out.println("n = " + p.n); // Only class or package
        // System.out.println("n_pri = " + p.n_pri); // Only class
        // System.out.println("n_pro = " + p.n_pro); // Only class, subclass or package
        System.out.println("n_pub = " + p.n_pub);
    }
}
