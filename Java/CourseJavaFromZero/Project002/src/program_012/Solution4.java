package program_012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class Add {
    public void add(int ... values) {
        int sum = 0;
        String addition = " ";
        for (int i : values) {
            sum += i;
            System.out.print(addition + i);
            addition = " + ";
        }
        System.out.println(" = " + sum);
    }
}

public class Solution4 {
    public static void main(String[] args) {

            Random randomNum = new Random();
            int n1 = randomNum.nextInt(0,100);
            int n2 = randomNum.nextInt(0, 100);
            int n3 = randomNum.nextInt(0, 100);
            int n4 = randomNum.nextInt(0, 100);
            int n5 = randomNum.nextInt(0, 100);
            int n6 = randomNum.nextInt(0, 100);

            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
    }
}
