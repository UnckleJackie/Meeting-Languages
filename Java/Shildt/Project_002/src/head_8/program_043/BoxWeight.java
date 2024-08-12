package head_8.program_043;

public class BoxWeight extends Box {
    double weight;  // box weight

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight; // get object to constructor
    }

    BoxWeight(double w, double h, double d, double m) {
//        Initialize width, height and depth, using super()
//        width = w;
//        height = h;
//        depth = d;
        super(w, h, d); // call the superclass constructor
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1; // standard constructor
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m; // cube box constructor
    }
}
