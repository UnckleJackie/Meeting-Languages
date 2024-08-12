package Vasilyev_JavaForEverybody.Head_07.Listing_10;

public class Demo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Alpha A = obj::set;
        Bravo B = obj::show;
        A.apply("Red");
        obj.show();
        obj.set("Yellow");
        B.display();
        obj = new MyClass();
        obj.set("Green");
        B.display();
        A.apply("Blue");
        obj.show();
        B.display();
    }
}
