package Vasilyev_JavaForEverybody.Head_08;

public class Demo8 {
    static void show(StringBuffer txt) {
        System.out.println("Text length: " + txt.length());
        System.out.println("Memory capacity: " + txt.capacity());
    }

    public static void main(String[] args) {
        StringBuffer A = new StringBuffer("Learning Java");
        StringBuffer B = new StringBuffer();
        StringBuffer C = new StringBuffer(30);
        System.out.println("Object A: ");
        show(A);
        System.out.println("Object B: ");
        show(B);
        System.out.println("Object C: ");
        show(C);
        A.insert(8, "C++ and ");
        System.out.println(A);
        A.replace(8, 11, "Python");
        System.out.println(A);
        System.out.println("Object A: ");
        show(A);
        A.trimToSize();
        show(A);
        A.setLength(14);
        System.out.println(A);
        show(A);
        A.ensureCapacity(50);
        show(A);
        A.reverse();
        System.out.println(A);
        System.out.println("Object B: ");
        B.append("Python and Basic");
        System.out.println(B);
        B.delete(1, 10);
        System.out.println(B);
        B.deleteCharAt(3);
        System.out.println(B);
        B.append('a');
        B.append('l');
        System.out.println(B);
    }
}
