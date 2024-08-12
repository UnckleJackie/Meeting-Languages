package Block_04.Listing_03;

public class MyDogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog is added to cell " + nextIndex);
            nextIndex++;
        }
    }
}
