package program_018;

public class Microwave extends Oven implements Electric, FoodPreparable {
    public Microwave(int cookingPower) {
        super(cookingPower);
    }
    @Override
    public void plugIn() {
        System.out.println("Plugged in a microwave");
    }
    @Override
    public void cook() {
        System.out.println("Heating plates");
    }
}
