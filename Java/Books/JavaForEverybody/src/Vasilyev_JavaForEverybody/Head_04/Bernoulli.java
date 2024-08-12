package Vasilyev_JavaForEverybody.Head_04;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;

public class Bernoulli {
    private int n;
    private double p;
    private boolean[] test;

    public void setAll(int n, double p) {
        if (n >= 0) this.n = n;
        else n = 0;
        if (p >= 0 && p <= 1) this.p = p;
        else this.p = 0;
        test = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (random() <= p) test[i] = true;
            else test[i] = false;
        }
    }

    private int getVal() {
        int count, i;
        for (i = 0, count = 0; i < n; i++) {
            if (test[i]) count++;
        }
        return count;
    }

    public void show() {
        System.out.println("Statistics for Bernoulli scheme");
        System.out.println("Tries: " + n);
        System.out.println("Variety of success: " + p);
        System.out.println("Successes: " + getVal());
        System.out.println("Falls: " + (n - getVal()));
        System.out.println("Math. waitiness: " + n * p);
        System.out.println("Отклонение: " + sqrt(n * p * (1 - p)));
    }
}
