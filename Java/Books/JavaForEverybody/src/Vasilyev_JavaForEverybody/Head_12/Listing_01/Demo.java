package Vasilyev_JavaForEverybody.Head_12.Listing_01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
    public static void main(String[] args) {
        Frame wnd = new Frame("Window AWI");
        wnd.setSize(300, 200);
        wnd.setLocation(500, 400);
        wnd.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        wnd.setVisible(true);
    }
}
