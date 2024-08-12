package Vasilyev_JavaForEverybody.Head_13;

import java.util.Arrays;
import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Coin A, B;
        try {
            System.out.print("First coin: ");
            A = Coin.valueOf(input.nextLine());
            System.out.print("Second coin: ");
            B = Coin.valueOf(input.nextLine());
            System.out.println(A.name() + " and " + B.name());
        } catch (Exception e) {
            System.out.println("Incorrect value");
            System.exit(0);
        }
        System.out.println("Constants " + Arrays.toString(Coin.values()));
        for (Coin s : Coin.values()) {
            System.out.println("[" + s.ordinal() + "]" + s.name());
        }
    }
}

