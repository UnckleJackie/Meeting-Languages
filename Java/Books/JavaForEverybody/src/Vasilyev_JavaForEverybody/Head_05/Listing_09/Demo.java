package Vasilyev_JavaForEverybody.Head_05.Listing_09;

public class Demo {
    public static void main(String[] args) {
        MatrixExp A = new MatrixExp(3, 0, 1);
        System.out.println("Matrix A: ");
        A.show();
        System.out.println("Matrix exp(A): ");
        A.mExp().show();
    }
}
