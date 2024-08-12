package Vasilyev_JavaForEverybody.Head_01;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Demo3 {
    public static void main(String[] args) {
        String txt, str;
        txt = showInputDialog("Enter text: ");
        int size = txt.length();
        char A = txt.charAt(0);
        char B = txt.charAt(size - 1);
        str = "Text: " + txt + "\n";
        str += "Symbols in text: " + size + "\n";
        str += "First symbol: " + A + "\n";
        str += "Last symbol: " + B;
        showMessageDialog(null, str);
    }
}
