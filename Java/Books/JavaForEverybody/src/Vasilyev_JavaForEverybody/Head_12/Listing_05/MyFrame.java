package Vasilyev_JavaForEverybody.Head_12.Listing_05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    private int count = 0;
    private String text = "Press button \"Number\": ";

    MyFrame(int x, int y) {
        super();
        setTitle("Window with buttons and sign");
        setBounds(x, y, 300, 200);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setLayout(null);
        Font f = new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 13);
        setFont(f);
        Panel P = new Panel();
        P.setBounds(10, 30, 280, 120);
        P.setBackground(Color.LIGHT_GRAY);
        P.setLayout(new BorderLayout());
        Label L = new Label(text + count);
        L.setAlignment(Label.CENTER);
        L.setForeground(Color.BLUE);
        P.add(L, BorderLayout.CENTER);
        add(P);
        Button A = new Button("Close");
        A.setBounds(40, 160, 90, 30);
        A.addActionListener(ae -> System.exit(0));
        add(A);
        Button B = new Button("Number");
        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                count++;
                if (count > 3) {
                    B.setEnabled(false);
                    L.setText("Button \"Number\" is blocked");
                } else {
                    L.setText(text + count);
                }
            }
        });
        B.setBounds(170, 160, 90, 30);
        add(B);
        setVisible(true);
    }
}
