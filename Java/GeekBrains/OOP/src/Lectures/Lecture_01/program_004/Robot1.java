package Lectures.Lecture_01.program_004;

public class Robot1 {
    /**
     * level of robot
     */
    public int level;
    /**
     * name of robot
     */
    public String name;

    /**
     * robot creation
     * @param name doesn't begin from digit
     * @param level level of robot
     */
    public Robot1(String name, int level) {
        this.name = name;
        this.level = level;
    }
    // Methods of switch on / off subsystems

    /**
     * Load BIOS
     */
    public void startBIOS() { System.out.println("Start BIOS..."); }

    /**
     * Load OS
     */
    public void startOS() { System.out.println("Start OS..."); }

    /**
     * Meeting
     */
    public void sayHi() { System.out.println("Hello, dude!.."); }

    /**
     * Stop BIOS
     */
    public void stopBIOS() { System.out.println("Stop BIOS..."); }

    /**
     * Stop OS
     */
    public void stopOS() { System.out.println("Stop OS..."); }

    /**
     * Say Goodbye
     */
    public void sayBye() { System.out.println("Bye, homie!.."); }

    /**
     * Working
     */
    public void work() { System.out.println("Working..."); }
}
