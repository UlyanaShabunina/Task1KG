package com.company;

import javax.swing.*;
import java.awt.*;

class Body extends JComponent {
    void body(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        Color c0 = new Color(214, 214, 214);
        g2d.setColor(c0);
        g2d.fillOval(65, 230, 250, 250);
        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.drawOval(65, 230, 250, 250);


        Color c1 = new Color(61, 98, 150);
        g2d.setColor(c1);
        g2d.fillArc(150, 200, 50, 115, 140, 170);
        g2d.fillArc(180, 200, 50, 115, 230, 300);
        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.drawArc(150, 200, 50, 115, 140, 170);
        g2d.drawArc(180, 200, 50, 115, 230, 300);
        g2d.drawArc(100, 280, 20, 50, 150, 150);
        g2d.drawArc(260, 280, 20, 50, 230, 150);


    }
}