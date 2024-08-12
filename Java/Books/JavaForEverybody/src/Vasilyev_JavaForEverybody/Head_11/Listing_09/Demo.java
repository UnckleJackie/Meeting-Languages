package Vasilyev_JavaForEverybody.Head_11.Listing_09;

public class Demo {
    public static void main(String[] args) {
        MyClass<String, Character> obj = new MyClass<>();
        obj.set("MyClass", 'D');
        obj.show();
        Alpha<Double> A = new Alpha<>();
        A.set(123.0, "Alpha");
        A.show();
        Bravo B = new Bravo();
        B.set('B', 321);
        B.show();
    }
}
