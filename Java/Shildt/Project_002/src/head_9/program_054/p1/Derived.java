package head_9.program_054.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор производного класса\n\tn = " + n + "\n");
        // System.out.println("n_pri = "4 + n_pri); // Only class
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
