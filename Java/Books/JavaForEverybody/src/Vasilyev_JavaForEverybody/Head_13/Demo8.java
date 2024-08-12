package Vasilyev_JavaForEverybody.Head_13;

public class Demo8 {
    static String inverse(String txt) {
        if (txt.length() > 0) {
            return inverse(txt.substring(1)) + txt.charAt(0);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String txt = "Learning Java";
        String str = inverse(txt);
        System.out.println(txt);
        System.out.println(str);
    }
}
