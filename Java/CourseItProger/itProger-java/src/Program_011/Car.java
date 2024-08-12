package Program_011;

public class Car extends Transport implements iLights {
    private boolean isOn = false;
    public Engine engine = new Engine();
    public Car() {};
    public Car(String name, float speed, int weight, String color, byte[] coordinate) {
        super(name, speed, weight, color, coordinate);
        super.getValues();
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Our object moves with the speed: " + speed);
    }
    @Override
    public void setLight(boolean set) {
        this.isOn = isOn;
    }
    @Override
    public void blinkLight() {
        System.out.println("We are blinking lights.");
    }
}
