package com.company;

import javax.swing.*;
import java.awt.*;

class Background extends JComponent {
    void background(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        Color с = new Color(121,154,151);
        g2d.setColor(с);
        g2d.fillRect(0, 0, 400, 360);


    }
}