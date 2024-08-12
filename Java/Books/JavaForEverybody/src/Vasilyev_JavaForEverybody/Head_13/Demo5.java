package Vasilyev_JavaForEverybody.Head_13;

public class Demo5 {
    static int sum(int... a) {
        int s = 0;
        for (int k = 0; k < a.length; k++) {
            s += a[k];
        }
        return s;
    }

    static String text(char... smb) {
        String txt = "";
        for (int k = 0; k < smb.length; k++) {
            txt += smb[k];
        }
        return txt;
    }

    public static void main(String[] args) {
        System.out.println("1 + 3 + 5 = " + sum(1, 3, 5));
        System.out.println("4 + 5 + 6 + 7 + 8 = " + sum(4, 5, 6, 7, 8));
        System.out.println(text('A', 'I', 'p', 'h', 'a'));
        System.out.println(text('C', 'h', 'a', 'r', 'l', 'i', 'e'));
    }
}
