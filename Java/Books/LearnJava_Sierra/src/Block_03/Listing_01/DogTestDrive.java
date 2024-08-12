package Block_03.Listing_01;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;
        Dog four = new Dog();

        one.bark();
        two.bark();
        three.bark();
        four.bark(5);
    }
}
