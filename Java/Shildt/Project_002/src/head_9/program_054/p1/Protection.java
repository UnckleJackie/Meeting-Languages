package head_9.program_054.p1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;
    public Protection() {
        System.out.println("Basic class constructor\n\tn = " + n +
                "\n\tn_pri = " + n_pri + "\n\tn_pro = " + n_pro +
                "\n\tn_pub = " + n_pub);
    }
}
