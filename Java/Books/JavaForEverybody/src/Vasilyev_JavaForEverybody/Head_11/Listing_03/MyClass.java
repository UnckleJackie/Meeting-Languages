package Vasilyev_JavaForEverybody.Head_11.Listing_03;

public class MyClass {
    String name;

    <T> void set(T obj) {
        name = obj.toString();
    }

    <T> T get(T[] objs, char symb) {
        int index = name.indexOf(symb);
        if (index < 0) index = 0;
        if (index >= objs.length) index = objs.length - 1;
        return objs[index];
    }

    public String toString() {
        return "{MyClass " + name + "}";
    }
}
