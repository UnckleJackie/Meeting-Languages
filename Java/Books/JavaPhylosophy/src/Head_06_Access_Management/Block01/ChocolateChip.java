package Head_06_Access_Management.Block01;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("Constructor ChocolateChip");
    }
    public void chomp() {
        //! bite(); // Method bite isn't allowed
    }
    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
