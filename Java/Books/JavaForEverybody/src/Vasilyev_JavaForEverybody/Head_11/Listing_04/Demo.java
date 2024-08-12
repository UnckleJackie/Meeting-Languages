package Vasilyev_JavaForEverybody.Head_11.Listing_04;

public class Demo {
    public static void main(String[] args) {
        MyClass A = new MyClass(123);
        System.out.println(A.name);
        MyClass B = new MyClass("Java");
        System.out.println(B.name);
        MyClass C = new MyClass(new Alpha(300));
        System.out.println(C.name);
    }
}
