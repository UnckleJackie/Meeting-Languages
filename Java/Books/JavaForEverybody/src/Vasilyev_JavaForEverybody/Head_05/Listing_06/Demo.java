package Vasilyev_JavaForEverybody.Head_05.Listing_06;

public class Demo {
    static void change(int n) {
        System.out.println("Initial variable value: " + n);
        n++;
        System.out.println("Finish variable value: " + n);
    }
    static void change(MyClass obj) {
        System.out.println("Initial field value: " + obj.code);
        obj.code++;
        System.out.println("Finish field value: " + obj.code);
    }
    public static void main(String[] args) {
        int code = 100;
        MyClass obj = new MyClass();
        obj.code = 200;
        System.out.println("Before method calling: code = " + code);
        change(code);
        System.out.println("After method calling: code = " + code);
        System.out.println("Before method calling: obj.code = " + obj.code);
        change(obj);
        System.out.println("After method calling: obj.code = " + obj.code);
        System.out.println("One more attempt");
        change(obj.code);
        System.out.println("After method calling: obj.code = " + obj.code);
    }
}
