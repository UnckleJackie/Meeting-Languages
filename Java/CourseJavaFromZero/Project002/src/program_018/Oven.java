package program_018;

public class Oven {
    private int cookingPower;
    public Oven(int cookingPower) {
        this.cookingPower = cookingPower;
    }
    public int getCookingPower() {
        return cookingPower;
    }
    public void turboBurn() {
        cookingPower *= 1000;
    }
}
