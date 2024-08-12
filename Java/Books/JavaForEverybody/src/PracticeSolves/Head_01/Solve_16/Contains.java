package PracticeSolves.Head_01.Solve_16;

import java.util.regex.Pattern;

public class Contains {
    public static void main(String[] args) {
        String text = "hello world!";
        String subtext = "orl";
        System.out.println(contains(text, subtext));
        System.out.println(contains2(text, subtext));
    }

    public static boolean contains(String text, String subtext) {
        return text.indexOf(subtext) != -1;
    }

    public static boolean contains2(String text, String subtext) {
        return text.matches("(?i).*" + Pattern.quote(subtext) + ".");
    }
}
