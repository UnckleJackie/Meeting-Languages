package Vasilyev_JavaForEverybody.Head_08;

public class Demo4 {
    public static void main(String[] args) {
        String A = "Java";
        String B = new String("Java");
        String C = "Java";
        String D = "JAVA";
        System.out.println("A.equals(B): " + A.equals(B));
        System.out.println("A==B: " + (A==B));
        System.out.println("A.equals(C): " + A.equals(C));
        System.out.println("A==C: " + (A==C));
        System.out.println("A.equals(D): " + A.equals(D));
        System.out.println("A.equalsIgnoreCase(D): " + A.equalsIgnoreCase(D));
    }
}
