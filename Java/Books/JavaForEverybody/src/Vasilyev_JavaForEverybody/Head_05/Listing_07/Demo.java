package Vasilyev_JavaForEverybody.Head_05.Listing_07;

public class Demo {
    public static void main(String[] args) {
        double x;
        int i, n = 4, N = 2 * n;
        Optimizer obj = new Optimizer(n);
        System.out.printf("%60s", "Values table:\n");
        System.out.printf("%25s", "Argument x");
        System.out.printf("%25s", "Function y = sin(x)");
        System.out.printf("%25s", "Interp Polynome L(x)");
        System.out.printf("%25s", "Regr. function f(x)\n");
        for (i = 0; i <= N; i++) {
            x = i * Math.PI/N/2;
            System.out.printf("%25s", x);
            System.out.printf("%25s", Math.sin(x));
            System.out.printf("%25s", obj.interp(x));
            System.out.printf("%25s", obj.approx(x) + "\n");
        }
    }
}
