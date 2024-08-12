package PracticeSolves.Head_01.Solve_07;

public class TransformString {

    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223433234";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.83423D";

    int toInt = Integer.parseInt(TO_INT);
    long toLong = Long.parseLong(TO_LONG);
    float toFloat = Float.parseFloat(TO_FLOAT);
    double toDouble = Double.parseDouble(TO_DOUBLE);

    Integer toInt2 = Integer.valueOf(TO_INT);
    Long toLong2 = Long.valueOf(TO_LONG);
    Float toFloat2 = Float.valueOf(TO_FLOAT);
    Double toDouble2 = Double.valueOf(TO_DOUBLE);

    private static final String WRONG_NUMBER = "452w";

    public static void main(String[] args) {
        try {
            Integer toIntWrong1 = Integer.valueOf(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        try {
            int toIntWrong2 = Integer.parseInt(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }
}
