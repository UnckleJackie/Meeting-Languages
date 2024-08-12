package Head_05_Initialization_and_Ending.Block_003;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        out.println("length a = " + a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500);
        out.println(Arrays.toString(a));
    }
}
