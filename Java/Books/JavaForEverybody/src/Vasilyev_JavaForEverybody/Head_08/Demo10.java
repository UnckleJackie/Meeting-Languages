package Vasilyev_JavaForEverybody.Head_08;

import java.util.Arrays;

public class Demo10 {
    static int count(CharSequence txt, char smb) {
        int res = 0;
        for (int k = 0; k < txt.length(); k++) {
            if (txt.charAt(k) == smb) res++;
        }
        return res;
    }

    static int words(CharSequence txt) {
        return count(txt, ' ') + 1;
    }

    static int[] find(String txt, char smb) {
        int[] res = {-1};
        int[] t;
        int k = 0;
        while (k < txt.length()) {
            if (txt.charAt(k) == smb) {
                res[0] = k;
                break;
            }
            k++;
        }
        while (k < txt.length() - 1) {
            k++;
            if (txt.charAt(k) == smb) {
                t = new int[res.length + 1];
                for (int m = 0; m < res.length; m++) {
                    t[m] = res[m];
                }
                t[res.length] = k;
                res = t;
            }
        }
        return res;
    }

    static char[] getSymbs(String txt) {
        String str = txt.toLowerCase();
        String res = "";
        char s;
        for (int k = 0; k < str.length(); k++) {
            s = str.charAt(k);
            switch (s) {
                case ' ':
                case '-':
                case ',':
                case '?':
                case '!':
                case ':':
                case ';':
                case '.':
                    continue;
            }
            if (!res.contains("" + s)) {
                res += s;
            }
        }
        return res.toCharArray();
    }

    public static void main(String[] args) {
        String txt = "Я помню чудное мгновенье";
        System.out.println(txt);
        char smb = 'н';
        System.out.printf("Finding cymbol \'%1$c\' in text: %2$s\n", smb,
                Arrays.toString(find(txt, smb)));
        smb = 'ю';
        System.out.printf("Finding symbol \'%1$c\' in text: %2$s\n", smb,
                Arrays.toString(find(txt, smb)));
        smb = 'а';
        System.out.printf("Finding symbol \'%1$c\' in text %2$s\n", smb,
                Arrays.toString(find(txt, smb)));
        String A = new String(txt);
        StringBuffer B = new StringBuffer(txt);
        StringBuilder C = new StringBuilder(txt);
        smb = 'о';
        System.out.printf("Letters \'%1$c\' in text: %2$s\n", smb, count(A, smb));
        smb = 'м';
        System.out.printf("Letters \'%1$c\' in text: %2$s\n", smb, count(B, smb));
        smb = 'ы';
        System.out.printf("Letters \'%1$c\' in text: %2$s\n", smb, count(C, smb));
        System.out.println("Words in text: " + words(txt));
        System.out.println("Letters in text: " + Arrays.toString(getSymbs(txt)));
        System.out.println("Letters in the empty text: " + Arrays.toString(getSymbs("")));
    }
}
