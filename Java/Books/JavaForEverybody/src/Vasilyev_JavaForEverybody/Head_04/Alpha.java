package Vasilyev_JavaForEverybody.Head_04;

public class Alpha {
    int number = 123;
    void show() {
        Bravo B = new Bravo();
        B.display();
    }
    class Bravo {
        void display() {
            System.out.println("Field number: " + number);
        }
    }
}
