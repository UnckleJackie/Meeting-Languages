package Vasilyev_JavaForEverybody.Head_05.Listing_04;

public class Demo {
    public static void main(String[] args) {
        MyClass A = new MyClass();
        A.show();
        MyClass B = new MyClass(200);
        B.show();
        MyClass C = new MyClass('C');
        C.show();
        MyClass D = new MyClass(400, 'D');
        D.show();
    }
}
