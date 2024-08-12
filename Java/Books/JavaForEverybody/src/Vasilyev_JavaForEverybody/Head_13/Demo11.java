package Vasilyev_JavaForEverybody.Head_13;

import java.util.Scanner;

public class Demo11 {
    static Coin getCoin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which coin? ");
        int n;
        n = input.nextInt();
        switch (n) {
            case 1:
                return Coin.ONE;
            case 3:
                return Coin.THREE;
            case 5:
                return Coin.FIVE;
            case 10:
                return Coin.TEN;
            case 20:
                return Coin.TWENTY;
            default:
                return Coin.FIFTY;
        }
    }

    public static void main(String[] args) {
        Coin A = Coin.TEN;
        Coin B = getCoin();
        System.out.println("First coin: " + A);
        System.out.println("Second coin: " + B);
        if (A == B) {
            System.out.println("That's a same");
        } else {
            if (A.ordinal() > B.ordinal()) {
                System.out.println(A + " - is more than " + B);
            } else {
                System.out.println(B + " - is more than " + A);
            }
        }
    }
}
