package Vasilyev_JavaForEverybody.Head_06.Listing_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.JOptionPane.showMessageDialog;

public class Demo {
    public static void main(String[] args) {
        String msg = "Blue color text";
        String txt = "Red color text";
        JLabel label = new JLabel(msg);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.blue);
        Font F = new Font("Arial", Font.ITALIC, 18);
        label.setFont(F);
        label.setBorder(BorderFactory.createEtchedBorder());

        class Handler extends MouseAdapter {
            public void mouseEntered(MouseEvent e) {
                label.setText(txt);
                label.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent e) {
                label.setText(msg);
                label.setForeground(Color.blue);
            }
        }
        ;
        Handler handler = new Handler();
        label.addMouseListener(handler);
        showMessageDialog(null, label, "Message", JOptionPane.PLAIN_MESSAGE);
    }
}
