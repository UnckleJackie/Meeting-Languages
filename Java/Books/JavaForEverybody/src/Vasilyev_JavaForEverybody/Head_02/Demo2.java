package Vasilyev_JavaForEverybody.Head_02;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Demo2 {
    public static void main(String[] args) {
        int res;
        res = showConfirmDialog(null, "Do you want to see a red panda?",
                "Question", YES_NO_OPTION);
        if (res == YES_OPTION) {
            String file = "C:\\Users\\anech\\OneDrive\\Pictures\\red_panda.jpg";
            ImageIcon img = new ImageIcon(file);
            showMessageDialog(null, img, "Red panda", PLAIN_MESSAGE);
        }
    }
}
