package Seminars.Seminar_01.Program_010;

public class HotDrinks extends BottleOfWater {
    private int temperature;
    public HotDrinks(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}
