package Vasilyev_JavaForEverybody.Head_06.Listing_01;

public class Demo {
    public static void main(String[] args) {
        Alpha A = new Alpha();
        System.out.println("Object A");
        A.number = 100;
        A.show();
        Bravo B = new Bravo();
        System.out.println("Object B");
        B.number = 200;
        B.value = 300;
        B.show();
        B.display();
        B.sum();
    }
}
