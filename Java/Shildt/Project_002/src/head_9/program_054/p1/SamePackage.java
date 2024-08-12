package head_9.program_054.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Constructor of Class from the same package\n\tn = " + p.n);
        //System.out.println("n_pri = " + p.n_pri); // Only Class
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
