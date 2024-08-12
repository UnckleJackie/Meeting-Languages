package program_017;

public class Tiger extends Animal {
    public Tiger() {
        super(2);
        System.out.println("Tiger Constructor");
    }
    @Override
    public String eatsFood() {
        return "meat";
    }
}
