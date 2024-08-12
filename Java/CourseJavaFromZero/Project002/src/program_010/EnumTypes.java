package program_010;

public class EnumTypes {
    Day day;
    public EnumTypes(Day day) {
        this.day = day;
    }

    public void enumSwitchDay() {
        switch (day) {
            case MONDAY: case TUESDAY: case WEDNESDAY: case THURSDAY: case FRIDAY:
                System.out.println("We work hard");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("We play hard");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTypes thursday = new EnumTypes(Day.THURSDAY);
        thursday.enumSwitchDay();
        EnumTypes saturday = new EnumTypes(Day.SATURDAY);
        saturday.enumSwitchDay();
    }
}
