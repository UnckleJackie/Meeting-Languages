package Block_05.Listing_01;

public class Duck {
    int size;

    public Duck() {
        System.out.println("Кря-кря");
    }

    public Duck(int duckSize) {
        System.out.println("Кря");
        if (duckSize == 0) {
            size = 27;
        } else {
            size = duckSize;
        }
        System.out.println("Size is " + size);
    }

    public void setSize(int newSize) {
        size = newSize;
    }
}
