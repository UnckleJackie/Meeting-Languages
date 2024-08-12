package Vasilyev_JavaForEverybody.Head_09;

public class Demo6 {
    static void generator() {
        try {
            NullPointerException obj = new NullPointerException("Our mistake");
            throw obj;
        } catch (NullPointerException e) {
            System.out.println("First throw exception: ");
            System.out.println("<" + e + ">");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            generator();
        } catch (NullPointerException e) {
            System.out.println("Repeated throw: ");
            System.out.println("{" + e + "}");
        }
        System.out.println("Program is over!");
    }
}
