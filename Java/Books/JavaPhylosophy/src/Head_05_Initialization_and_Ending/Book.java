package Head_05_Initialization_and_Ending;

public class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    public void finalize() {
        if (checkedOut)
            System.out.println("ERROR: checkedOut");
        // Usually it is doing^
        // Super.finalize();
    }
}
