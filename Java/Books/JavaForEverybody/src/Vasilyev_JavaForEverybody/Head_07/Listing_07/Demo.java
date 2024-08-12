package Vasilyev_JavaForEverybody.Head_07.Listing_07;

public class Demo {
    public static void main(String[] args) {
        Alpha A = (String t) -> {
            return t.length();
        };
        Alpha B = (String t) -> {
            return (int)t.charAt(0);
        };
        String t = "Java";
        System.out.println("Text length: " + A.get(t));
        System.out.println("Symbol code: " + B.get(t));
    }
}
