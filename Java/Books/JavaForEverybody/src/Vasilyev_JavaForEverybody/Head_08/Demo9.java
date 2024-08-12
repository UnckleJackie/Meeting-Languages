package Vasilyev_JavaForEverybody.Head_08;

public class Demo9 {
    public static void main(String[] args) {
        StringBuilder A = new StringBuilder(30);
        System.out.println("Text length: " + A.length());
        System.out.println("Memory capacity: " + A.capacity());
        A.append("Learning Java");
        System.out.println(A);
        A.insert(8, " language ");
        System.out.println(A);
        A.replace(0, 3, "Y").replace(2, 4, "and");
        System.out.println(A);
        String B = A.toString();
        System.out.println(B);
    }
}
