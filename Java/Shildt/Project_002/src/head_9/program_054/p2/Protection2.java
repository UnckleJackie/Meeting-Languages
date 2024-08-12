package head_9.program_054.p2;

public class Protection2 extends head_9.program_054.p1.Protection {
    Protection2() {
        System.out.println("Конструктор производного класса из другого пакета");
        // System.ut.println("n = " + n); // Only class or package
        // System.out.println("n_pri = " + n_pri); // Only class
        System.out.println("n_pro = " + n_pro + "\nn_pub = " + n_pub);
    }
}
