package Vasilyev_JavaForEverybody.Head_03;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        char[] symbs = { 'J', 'a', 'v', 'a' };
        String str = Arrays.toString(symbs);
        String txt = new String(symbs);
        System.out.println(symbs);
        System.out.println(str);
        System.out.println(txt);
        char[] word = "Pascal".toCharArray();
        System.out.println(Arrays.toString(word));
    }
}
