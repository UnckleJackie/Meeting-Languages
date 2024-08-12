package Vasilyev_JavaForEverybody.Head_12.Listing_07;

import java.awt.*;

public class ButtonPanel extends Panel {
    public Label[] L;
    public CheckboxGroup CbxGrp;
    public Checkbox[] Cbx;
    public Choice Chc;
    public TextField TxtFld;
    public Button B1, B2;

    ButtonPanel(int x, int y, int W, int H) {
        setLayout(null);
        setBounds(x, y, W, H);
        setBackground(Color.LIGHT_GRAY);
        L = new Label[3];
        L[0] = new Label("Choice color: ", Label.CENTER);
        L[0].setFont(new Font("Arial", Font.BOLD, 12));
        L[0].setBounds(5, 5, getWidth() - 10, 30);
        add(L[0]);
        CbxGrp = new CheckboxGroup();
        Cbx = new Checkbox[4];
        Cbx[0] = new Checkbox(" red ", CbxGrp, true);
        Cbx[1] = new Checkbox(" blue ", CbxGrp, false);
        Cbx[2] = new Checkbox(" black ", CbxGrp, false);
        Cbx[3] = new Checkbox(" Grid ", true);
        for (int i = 0; i < 4; i++) {
            Cbx[i].setBounds(5, 30 + i * 25, getWidth() - 10, 30);
            add(Cbx[i]);
        }
        Chc = new Choice();
        Chc.add("Green");
        Chc.add("Yellow");
        Chc.add("Gray");
        Chc.setBounds(20, 140, getWidth() - 25, 30);
        add(Chc);
        L[1] = new Label("Interval on x: ", Label.CENTER);
        L[1].setFont(new Font("Arial", Font.BOLD, 12));
        L[1].setBounds(5, 220, getWidth() - 10, 30);
        add(L[1]);
        L[2] = new Label("From x = 0 to x = ", Label.LEFT);
        L[2].setBounds(5, 250, 70, 20);
        add(L[2]);
        TxtFld = new TextField("10");
        TxtFld.setBounds(75, 250, 45, 20);
        add(TxtFld);
        B1 = new Button("Draw");
        B2 = new Button("Close");
        B1.setBounds(5, getHeight() - 75, getWidth() - 10, 30);
        B2.setBounds(5, getHeight() - 35, getWidth() - 10, 30);
        add(B1);
        add(B2);
    }
}
