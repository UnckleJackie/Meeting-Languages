package Vasilyev_JavaForEverybody.Head_09;

public class MyException extends RuntimeException {
    private int code;

    MyException(int code) {
        super("Error of MyException class");
        this.code = code;
    }

    public String getMessage() {
        return super.getMessage() + "\nError code " + code;
    }

    public String toString() {
        return "<MyException: " + code + ">";
    }
}
