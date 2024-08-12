package Vasilyev_JavaForEverybody.Head_07.Listing_06;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

class Demo {
    public static void main(String[] args) {
        String title = "Smile!";
        String path = "C:\\Pictures\\";
        ImageIcon smile = new ImageIcon(path + "smile.jpg");
        ImageIcon sad = new ImageIcon(path + "sad.jpg");
        JLabel label = new JLabel(sad);
        MouseListener handler = new MouseListener() {
            public void mouseEntered(MouseEvent e) {
                label.setIcon(smile);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            public void moiseExited(MouseEvent e) {
                label.setIcon(sad);
            }

            public void mouseClicked(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }
        };
        label.addMouseListener(handler);
        showMessageDialog(null,label, title, PLAIN_MESSAGE);
    }
}
