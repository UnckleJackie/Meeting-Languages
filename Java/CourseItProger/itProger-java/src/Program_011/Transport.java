package Program_011;

public abstract class Transport {
    private String name;
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;
    public Transport() {};
    public Transport(String name, float speed, int weight, String color, byte[] coordinate) {
        setValues(name, speed, weight, color, coordinate);
        //System.out.println(getValues());
    }

    public abstract void moveObject(float speed);

    public Transport(String name, int weight, byte[] coordinate) {
        this.name = name;
        this.weight = weight;
        this.coordinate = coordinate;
    }



    protected void setValues(String name, float speed, int weight, String color, byte[] coordinate) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = this.name + " speed: " + this.speed + ". Weight: " + this.weight +
                ". Color: " + this.color;
        String infoCoordinate = "\tCoordinates: [ ";
        for (int i = 0; i < this.coordinate.length; i++) {
            infoCoordinate += this.coordinate[i] + " ";
        }
        return info + infoCoordinate + "]";
    }
    class Engine {
        private boolean isReady;
        private int km;
        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }
        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }
        public void info() {
            if (isReady)
                System.out.println("Engine is READY");
            else
                System.out.println("Engine isn't working. It goes " + km + " km already.");
        }
    }
}
