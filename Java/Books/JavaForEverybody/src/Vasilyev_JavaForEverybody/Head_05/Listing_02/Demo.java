package Vasilyev_JavaForEverybody.Head_05.Listing_02;

public class Demo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.set(100, 'A');
        obj.show();
        obj.set(200);
        obj.show();
        obj.set('B');
        obj.show();
        obj.set('A', 'D');
        obj.show();
    }
}
