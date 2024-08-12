package Head_05_Initialization_and_Ending.Block_003;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        out.println("Length a = " + a.length);
        out.println(Arrays.toString(a));
    }
}
