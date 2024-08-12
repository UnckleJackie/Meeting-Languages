package Head_08_Polymorphism.Listing_07;

public class WheatMill extends Mill {
    public Wheat process() {
        return new Wheat();
    }
}
