package Head_04_Managing_Constructions;

import static java.lang.System.out;

public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while(true) {
            out.println("Outer loop while");
            while(true) {
                i++;
                out.println("i = " + i);
                if (i == 1) {
                    out.println("continue");
                    continue;
                }
                if (i == 3) {
                    out.println("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    out.println("break");
                    break;
                }
                if (i == 7) {
                    out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
