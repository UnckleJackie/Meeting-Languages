package Vasilyev_JavaForEverybody.Head_04.Matrix;

public class Demo {
    public static void main(String[] args) {
        Matrix obj = new Matrix();
        obj.create(3);
        obj.unit();
        System.out.println("Единичная матрица: ");
        obj.show();
        obj.value(5);
        System.out.println("All the items are equals: ");
        obj.show();
        obj.rand();
        System.out.println("Random numbers: ");
        obj.show();
        System.out.println("After transponire: ");
        obj.trans();
        obj.show();
        System.out.println("Trace of matrix: " + obj.trace());
        System.out.println("Deteriorator of matrix: " + obj.det());
        obj.create(5);
        obj.digits();
        System.out.println("Digits sequence: ");
        obj.show();
        System.out.println("Deteriorator of matrix: " + obj.det());
    }
}
