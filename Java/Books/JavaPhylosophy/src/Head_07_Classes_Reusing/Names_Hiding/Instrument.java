package Head_07_Classes_Reusing.Names_Hiding;

public class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}
