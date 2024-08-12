package Vasilyev_JavaForEverybody.Head_04;

public class Demo {
    public static void main(String[] args) {
        MyClass2 A = new MyClass2();
        MyClass2 B;
        B = new MyClass2();
        A.set("Object A", 100);
        B.name = "Object B";
        B.number  = 200;
        A.show();
        B.show();
        A.number = 300;
        A.show();
    }
}
