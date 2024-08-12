package head_8.program_045;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);      // Constructor for cloning object
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // if all parameters constructor
        cost = c;
    }

    Shipment() {
        super();
        cost = -1; // standard constructor
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
