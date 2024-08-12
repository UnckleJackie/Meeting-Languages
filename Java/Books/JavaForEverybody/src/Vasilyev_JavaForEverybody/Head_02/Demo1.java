package Vasilyev_JavaForEverybody.Head_02;

import static java.lang.Integer.parseInt;
import static java.lang.Math.random;
import static javax.swing.JOptionPane.*;

public class Demo1 {
    public static void main(String[] args) {
        int num, ans, icon;
        String txt;
        num = (int)(5 * random()) + 1;
        ans = parseInt(showInputDialog(null, "What a number (1 to 5): ",
                "Number", QUESTION_MESSAGE)
        );
        if (ans == num) {
            txt = "You goddamn right! That's " + num + "!";
            icon = INFORMATION_MESSAGE;
        } else {
            txt = "No, no, no! That wos " + num + "!";
            icon = ERROR_MESSAGE;
        }
        showMessageDialog(null, txt, "Result", icon);
    }
}
