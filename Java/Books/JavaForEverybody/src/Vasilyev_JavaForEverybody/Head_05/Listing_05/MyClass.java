package Vasilyev_JavaForEverybody.Head_05.Listing_05;

public class MyClass {
    int code;
    void show() {
        System.out.println("Field: " + code);
    }
    MyClass(int n) {
        code = n;
    }
    MyClass(MyClass obj) {
        code = obj.code;
    }
    MyClass get(MyClass obj) {
        MyClass tmp = new MyClass(code);
        tmp.code += obj.code;
        return tmp;
    }
}
