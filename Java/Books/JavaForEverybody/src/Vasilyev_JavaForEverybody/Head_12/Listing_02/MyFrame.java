package Vasilyev_JavaForEverybody.Head_12.Listing_02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    MyFrame(String name) {
        super(name);
        setSize(300, 200);
        setLocation(500, 400);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
}
