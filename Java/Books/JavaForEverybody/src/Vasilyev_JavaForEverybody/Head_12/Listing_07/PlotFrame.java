package Vasilyev_JavaForEverybody.Head_12.Listing_07;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlotFrame extends Frame {
    PlotFrame(int H, int W) {
        setTitle("Function graph");
        setBounds(100, 50, W, H);
        setBackground(Color.GRAY);
        setLayout(null);
        Font f = new Font("Arial", Font.BOLD, 11);
        setFont(f);
        setResizable(false);
        setIconImage(getToolkit().getImage("D:/Pictures/Icons/icon.png"));
        ButtonPanel BtnPnl = new ButtonPanel(6, 25, W / 4, H - 30);
        add(BtnPnl);
        PlotPanel PltPnl = new PlotPanel(W / 4 + 10, 25, 3 * W / 4 - 15, H - 120, BtnPnl);
        add(PltPnl);
        HelpPanel HlpPnl = new HelpPanel(W / 4 + 10, H - 90, 3 * W / 4 - 15, 85);
        add(HlpPnl);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        BtnPnl.B1.addActionListener(new ButtonOneHandler(BtnPnl, PltPnl));
        BtnPnl.B2.addActionListener(new ButtonTwoHandler());
        BtnPnl.Cbx[3].addItemListener(new CheckboxHandler(BtnPnl));
        setVisible(true);
    }
}
