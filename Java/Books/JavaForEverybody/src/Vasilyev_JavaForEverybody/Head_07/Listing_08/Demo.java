package Vasilyev_JavaForEverybody.Head_07.Listing_08;

public class Demo {
    public static void main(String[] args) {
        Alpha A = t -> t.length();
        Alpha B = t -> t.charAt(0);
        String t = "Java";
        System.out.println("Text length: " + A.get(t));
        System.out.println("Symbol code: " + B.get(t));
    }
}
