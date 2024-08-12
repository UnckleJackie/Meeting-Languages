package Vasilyev_JavaForEverybody.Head_04;

import javax.swing.*;

public class Demo2 {
    static ImageIcon pict = new ImageIcon("C:\\Users\\anech\\OneDrive\\Pictures\\red_panda.jpg");
    static String[] btns = { "Next", "Close"};
    static void show(String txt) {
        int res = JOptionPane.showOptionDialog(null, txt, "Message",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, pict, btns, btns[0]);
        if (res != 0) System.exit(0);
    }
    public static void main(String[] args) {
        show ("Hello!\nShow binary code?");
        MyCalcs.number = 25;
        String txt = "Number: " + MyCalcs.number;
        txt += "\nBinary code: " + MyCalcs.getCode();
        show(txt);
    }
}
