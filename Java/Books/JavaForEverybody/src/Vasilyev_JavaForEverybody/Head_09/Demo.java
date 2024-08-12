package Vasilyev_JavaForEverybody.Head_09;

import static javax.swing.JOptionPane.*;

public class Demo {
    public static void main(String[] args) {
        String text = showInputDialog(null, "Enter text: ",
                "Need text",QUESTION_MESSAGE);
        try {
            showMessageDialog(null, "In text " + text.length() +
                    " symbols", "Symbols", INFORMATION_MESSAGE);
        } catch (Exception e) {
            showMessageDialog(null, "Something wrong...", "Error",
                    ERROR_MESSAGE);
        }
    }
}
