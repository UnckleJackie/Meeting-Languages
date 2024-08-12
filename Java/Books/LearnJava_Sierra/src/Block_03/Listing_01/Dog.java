package Block_03.Listing_01;

public class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Haf - Haf !!!");
        } else if (size > 14) {
            System.out.println("Woof - Woof !");
        } else {
            System.out.println("Chicken - chicken ...");
        }
    }
    void bark(int numOfBarks) {
        while(numOfBarks > 0) {
            System.out.println("Haf");
            numOfBarks = numOfBarks - 1;
        }
    }
}
