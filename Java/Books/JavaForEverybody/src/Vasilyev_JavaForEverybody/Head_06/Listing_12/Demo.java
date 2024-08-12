package Vasilyev_JavaForEverybody.Head_06.Listing_12;

public class Demo {
    public static void main(String[] args) {
        MyClass A = new MyClass(100) {
            void show() {
                System.out.println("Object A: " + code);
            }
        };
        MyClass B = new MyClass(200) {
            void show() {
                System.out.println("Object B: " + code);
            }
        };
        A.show();
        B.show();
        A.code = 150;
        B.code = 250;
        A.show();
        B.show();
    }
}
