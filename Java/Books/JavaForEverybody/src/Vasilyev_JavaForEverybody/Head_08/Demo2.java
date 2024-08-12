package Vasilyev_JavaForEverybody.Head_08;

public class Demo2 {
    public static void main(String[] args) {
        MyClass A = new MyClass("First", 100, 'A');
        System.out.println(A);
        MyClass B = new MyClass("Second", 200, 'B');
        String str = "Created new object\n" + B;
        System.out.println(str);
    }
}
