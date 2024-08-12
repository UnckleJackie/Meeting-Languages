package program_011;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 10, j = -10; i > 0 && j < 0;i--, j++) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
