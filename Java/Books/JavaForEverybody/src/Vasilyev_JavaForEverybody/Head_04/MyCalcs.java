package Vasilyev_JavaForEverybody.Head_04;

public class MyCalcs {
    static int number;
    static String getCode() {
        String res = "";
        int n = number;
        do {
            res = (n & 1) + res;
            n >>>= 1;
        } while (n > 0);
        return res;
    }
}
