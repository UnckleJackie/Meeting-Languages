package Vasilyev_JavaForEverybody.Head_07.Listing_09;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Demo {
    static int index = 0;

    public static void main(String[] args) {
        String path = "C:\\Pictures\\";
        String[] names = {"Lion", "Tiger", "Panda"};
        String[] files = {"lion.jpg", "tiger.jpg", "red_panda.jpg"};
        ImageIcon[] imgs = new ImageIcon[files.length];
        for (int k = 0; k < imgs.length; k++) {
            imgs[k] = new ImageIcon(path + files[k]);
        }
        JButton button = new JButton(names[index], imgs[index]);
        button.setVerticalTextPosition(JLabel.BOTTOM);
        button.setHorizontalTextPosition(JLabel.CENTER);
        Font F = new Font("Courier New", Font.BOLD, 25);
        button.setFont(F);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.WHITE);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.addActionListener(e -> {
            index = (index + 1) % files.length;
            button.setIcon(imgs[index]);
            button.setText(names[index]);
        });
        /*
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index = (index + 1) % files.length;
                button.setIcon(imgs[index]);
                button.setText(names[index]);
            }
         });
         */
        showMessageDialog(null, button, "Animals", PLAIN_MESSAGE);
    }
}
