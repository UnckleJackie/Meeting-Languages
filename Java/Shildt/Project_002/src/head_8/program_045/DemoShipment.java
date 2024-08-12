package head_8.program_045;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.4);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("\nVolume shipment1 is " + vol +
                "\nWeight shipment1 is " + shipment1.weight +
                "\nShipment costs: $" + shipment1.cost);
        vol = shipment2.volume();
        System.out.println("\nVolume shipment2 is " + vol +
                "\nWeight shipment2 is " + shipment2.weight +
                "\nShipment costs $" + shipment2.cost + "\n");
    }
}
