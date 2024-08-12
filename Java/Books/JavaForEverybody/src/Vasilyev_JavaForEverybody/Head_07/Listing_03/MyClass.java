package Vasilyev_JavaForEverybody.Head_07.Listing_03;

public class MyClass extends Base implements Alpha, Bravo {
    int value;

    public void apply(int n) {
        number = n;
    }

    public void set(int n) {
        value = n;
    }

    void show() {
        super.show();
        System.out.println("Field value: " + value);
    }
}
