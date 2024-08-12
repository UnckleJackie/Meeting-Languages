package Block_03.Listing_03;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Haf - Haf !!!");
        } else if (size > 14) {
            System.out.println("Wof - Wof !");
        } else {
            System.out.println("Ckicken - Chicken ...");
        }
    }
}
