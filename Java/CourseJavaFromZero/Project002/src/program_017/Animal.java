package program_017;

public abstract class Animal {
    private int eyes;
    public Animal(int eyes) {
        System.out.println("Animal Constructor");
        this.eyes = eyes;
    }
    public int getEyes() {
        return this.eyes;
    }
    public abstract String eatsFood();
}
