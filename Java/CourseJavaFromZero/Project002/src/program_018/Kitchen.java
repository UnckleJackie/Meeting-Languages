package program_018;

public class Kitchen {
    public static void main(String[] args) {
        FoodPreparable[] fp = {
                new GoodOldOven(10),
                new Microwave(100),
                // new Oven(1000),
                // new Electric()
        };
        for (FoodPreparable appliance : fp) {
            if (appliance instanceof Electric) {
                ((Electric) appliance).plugIn();
            }
        }
        Electric[] e = {
                new Microwave(100),
                new ElectricKnifeSharpener()
        };
        for (Electric el : e) {
            if (el instanceof FoodPreparable) {
                ((FoodPreparable) el).cook();
            }
        }
    }
}
