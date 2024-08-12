package Program_011;

public class Truck extends Transport {

    private boolean isLoaded;
    public Engine engine = new Engine();

    public Truck(String name, int weight, byte[] coordinate) {
        super(name, weight, coordinate);
    }

    public void setValues(String name, float speed, int weight, String color,
                          byte[] coordinate, boolean isLoaded) {
        super.setValues(name, speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    public Truck(String name, int weight, byte[] coordinate, boolean isLoaded) {
        super(name, weight, coordinate);
        //color = "sdf";
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Our object moves with the speed: " + speed);
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }
    public void setLoaded(boolean loaded) { this.isLoaded = loaded; }

    public String getLoaded() {
        if (isLoaded)
            return "Truck is loaded!";
        else
            return "Not loaded";
    }


}
