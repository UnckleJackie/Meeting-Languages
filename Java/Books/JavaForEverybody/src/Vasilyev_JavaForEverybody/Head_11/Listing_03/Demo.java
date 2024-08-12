package Vasilyev_JavaForEverybody.Head_11.Listing_03;

public class Demo {
    public static void main(String[] args) {
        Alpha A = new Alpha(100);
        MyClass obj = new MyClass();
        obj.set(A);
        System.out.println(obj);
        obj.set(obj);
        System.out.println(obj);
        obj.set(200);
        System.out.println(obj);
        obj.set("Object");
        System.out.println(obj);
        Integer[] nums = {1, 2, 3, 4, 5};
        Alpha[] objs = new Alpha[5];
        for (int k = 0; k < objs.length; k++) {
            objs[k] = new Alpha((k + 1) * 10);
        }
        String[] txt = {"one", "two", "three", "four", "five"};
        Character[] symbs = {'A', 'B', 'C', 'D', 'E'};
        Integer n = obj.get(nums, 'w');
        Alpha a = obj.get(objs, 't');
        String t = obj.get(txt, 'e');
        Character s = obj.get(symbs, 'u');
        System.out.println("Integer: " + n);
        System.out.println("Alpha: " + n);
        System.out.println("String: " + t);
        System.out.println("Character: " + s);
    }
}
