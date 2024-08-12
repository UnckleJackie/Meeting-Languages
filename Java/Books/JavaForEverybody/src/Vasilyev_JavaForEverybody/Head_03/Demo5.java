package Vasilyev_JavaForEverybody.Head_03;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Demo5 {
    public static void main(String[] args) {
        String path = "C:\\Users\\anech\\OneDrive\\Pictures\\";
        String[] names = { "Lion", "Tiger", "Panda" };
        String[] files = { "lion.jpg", "tiger.jpg", "red_panda.jpg" };
        String animal = (String)showInputDialog(null, "Whot animal?",
                "Animals", QUESTION_MESSAGE, null, names, names[0]);
        int index = 0;
        for (int k = 1; k < names.length; k++) {
            if (animal.equals(names[k])) {
                index = k;
                break;
            }
        }
        ImageIcon img = new ImageIcon(path + files[index]);
        showMessageDialog(null, img, animal, PLAIN_MESSAGE);
    }
}
