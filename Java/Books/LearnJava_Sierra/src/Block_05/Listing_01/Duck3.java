package Block_05.Listing_01;

public class Duck3 {
    int pounds = 6;
    float floatability = 2.1F;
    String name = "Universal";
    long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    boolean canFly = true;
    int maxSpeed = 25;

    public Duck3() {
        System.out.println("Duck type 1");
    }

    public Duck3(boolean fly) {
        canFly = fly;
        System.out.println("Duck type 2");
    }

    public Duck3(String n, long[] f) {
        name = n;
        feathers = f;
        System.out.println("Duck type 3");
    }

    public Duck3(int w, float f) {
        pounds = w;
        floatability = f;
        System.out.println("Duck type 4");
    }

    public Duck3(float density, int max) {
        floatability = density;
        maxSpeed = max;
        System.out.println("Duck type 5");
    }
}
