package Vasilyev_JavaForEverybody.Head_03;

import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] A, B;
        System.out.print("First array: ");
        A = input.nextLine().toCharArray();
        System.out.print("Second array: ");
        B = input.nextLine().toCharArray();
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("B = " + Arrays.toString(B));
        System.out.print("Variables of array: ");
        if (A == B) System.out.println("A == B");
        else System.out.println("A != B");
        System.out.print("Arrays equalization: ");
        boolean state = true;
        if (A.length != B.length) {
            state = false;
        } else {
            for (int k = 0; k < A.length; k++) {
                if (A[k] != B[k]) {
                    state = false;
                    break;
                }
            }
        }
        if (state) System.out.println("A == B");
        else System.out.println("A != B");
    }
}
