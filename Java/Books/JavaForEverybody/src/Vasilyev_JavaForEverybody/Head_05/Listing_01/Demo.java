package Vasilyev_JavaForEverybody.Head_05.Listing_01;

public class Demo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.set();
        obj.show();
        obj.set(111, 222);
        obj.show(false);
        obj.show(true);
        obj.set(123);
        obj.show();
    }
}
