package Head_07_Classes_Reusing.Names_Hiding;

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
