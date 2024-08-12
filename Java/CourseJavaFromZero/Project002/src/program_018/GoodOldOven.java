package program_018;

public class GoodOldOven extends Oven implements FoodPreparable {
    public GoodOldOven(int cookingPower) {
        super(cookingPower);
    }
    @Override
    public void cook() {
        System.out.println("Cooking in a Good Old Fashion");
    }
}
