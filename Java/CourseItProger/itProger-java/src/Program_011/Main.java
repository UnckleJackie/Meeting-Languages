package Program_011;

public class Main {
    public static void main(String[] args) {
        byte[] coordsInit = new byte[] { 0, 0, 0 };
        // OOP: Classes and objects
        Car bmw = new Car("BMW", 250f, 2525, "White", coordsInit);
        bmw.engine.setValues(true, 10000);
        bmw.engine.info();
        Truck truck = new Truck("Ford F-150", 5600, new byte[] {100, 0, 100});
        truck.setValues("MAN-5504", 160f, 18000, "White", coordsInit, true);
        System.out.println(truck.getValues());
        truck.moveObject(90f);
        truck.engine.setValues(false, 1000000);
        truck.engine.info();
        //Car mercedes_benz = new Car("Mercedes-Benz", 250f, 2800, "Black", new byte[] {15, 10, 0});

        Car flyCar = new Car("fly Car",250.5f, 2500, "Red", coordsInit) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);
                this.engine.isReady(true);
                System.out.println("Car flies!");
            }
        };

        flyCar.moveObject(450);

        Car kia = new Car();
        kia.setLight(true);
        kia.blinkLight();

    }
}
