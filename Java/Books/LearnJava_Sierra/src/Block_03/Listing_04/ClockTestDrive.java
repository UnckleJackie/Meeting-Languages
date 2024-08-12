package Block_03.Listing_04;

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("Time is " + tod);
    }
}
