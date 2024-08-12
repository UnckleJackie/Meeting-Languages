package Vasilyev_JavaForEverybody.Head_03;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Demo6 {
    public static void main(String[] args) {
        String path = "C:\\Users\\anech\\OneDrive\\Pictures\\";
        String[] names = { "Lion", "Tiger", "Panda" };
        String[] files = { "lion.jpg", "tiger.jpg", "red_panda.jpg" };
        int index = showOptionDialog(null, "Choose animal", "Animals",
                DEFAULT_OPTION, WARNING_MESSAGE,null, names, names[0]);
        ImageIcon img = new ImageIcon(path + files[index]);
        showMessageDialog(null, img, names[index], PLAIN_MESSAGE);
    }
}
