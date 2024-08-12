package Head_05_Initialization_and_Ending;

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Right cleaning:
        novel.checkIn();
        // Lose link, forgot about cleaning:
        new Book(true);
        // Enforced cleaning and finalization:
        System.gc();
    }
}
