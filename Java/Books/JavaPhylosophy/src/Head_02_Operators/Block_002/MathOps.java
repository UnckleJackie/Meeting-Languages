package Head_02_Operators.Block_002;

import java.util.Random;

import static java.lang.System.out;

public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        out.println("k : " + k);
        i = j + k;
        out.println("j + k : " + i);
        i = j - k;
        out.println("j - k : " + i);
        i = k * j;
        out.println("k * j : " + i);
        i = k / j;
        out.println("k / j : " + i);
        i = k % j;
        out.println("k % j : " + i);
        j %= k;
        out.println("j %/ k : " + j);
        float u, v , w;
        v = rand.nextFloat();
        out.println("v : " + v);
        w = rand.nextFloat();
        out.println("w : " + w);
        u = v + w;
        out.println("v + w : " + u);
        u = v - w;
        out.println("v - w : " + u);
        u = v * w;
        out.println("v * w : " + u);
        u = v / w;
        out.println("v / w : " + u);
        u += v;
        out.println("u += v : " + u);
        u -= v;
        out.println("u -= v : " + u);
        u *= v;
        out.println("u *= v : " + u);
        u /= v;
        out.println("u /= v : " + u);
    }
}
