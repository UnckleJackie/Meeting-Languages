package Head_02_Operators.Block_002;

import java.util.Random;

import static java.lang.System.out;

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        out.println("i = " + i);
        out.println("j = " + j);
        out.println("i > j is " + (i > j));
        out.println("i < j is " + (i < j));
        out.println("i >= j is " + (i >= j));
        out.println("i <= j is " + (i <= j));
        out.println("i == j is " + (i == j));
        out.println("i != j is " + (i != j));
        out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }
}
