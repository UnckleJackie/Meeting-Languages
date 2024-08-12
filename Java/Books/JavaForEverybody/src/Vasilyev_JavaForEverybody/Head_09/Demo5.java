package Vasilyev_JavaForEverybody.Head_09;

import java.util.Random;

public class Demo5 {
    static void generator(int a) {
        int nums[] = {-1, 1};
        try {
            if (a == 1) a = a / (a - 1);
            else nums[a] = 200;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index: " + e);
        } finally {
            System.out.println("Shit happens always!");
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int a, b;
        for (int k = 1; k <= 5; k++) {
            System.out.println("Try #" + k);
            try {
                a = r.nextInt(3);
                b = 100 / a;
                System.out.println("b=" + b);
                generator(a);
            } catch (ArithmeticException e) {
                System.out.println("Dividing to zero: " + e);
            }
        }
    }
}
