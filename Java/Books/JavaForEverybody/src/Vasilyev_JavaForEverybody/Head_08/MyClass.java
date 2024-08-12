package Vasilyev_JavaForEverybody.Head_08;

public class MyClass {
    String name;
    int code;
    char symb;

    MyClass(String name, int code, char symb) {
        this.name = name;
        this.code = code;
        this.symb = symb;
    }

    public String toString() {
        String res = "Name: " + name + "\n";
        res += "Number: " + code + "\n";
        res += "Symbol: " + symb + "\n";
        return res;
    }
}
