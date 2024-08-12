package Vasilyev_JavaForEverybody.Head_09;

public class Demo7 {
    static void generator() throws IllegalAccessException {
        System.out.println("Running method");
        throw new IllegalAccessException("Fatal ERROR!");
    }

    public static void main(String[] args) {
        try {
            generator();
        } catch (IllegalAccessException e) {
            System.out.println("There's a problem: ");
            System.out.println("<" + e + ">");
        }
    }
}
