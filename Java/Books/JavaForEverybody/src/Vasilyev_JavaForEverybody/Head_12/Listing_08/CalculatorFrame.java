package Vasilyev_JavaForEverybody.Head_12.Listing_08;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    CalculatorFrame() {
        int w = 270, h = 240;
        setTitle("Calculator");
        setBounds(100, 100, w, h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        CalcPanel panel = new CalcPanel(w, h);
        add(panel);
        setResizable(false);
        setVisible(true);
    }
}
