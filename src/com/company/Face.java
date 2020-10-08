package com.company;

import javax.swing.*;
import java.awt.*;

class Face extends JComponent {
    void face(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.drawOval(70, 170, 40, 50);

        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.drawOval(270, 170, 40, 50);

        Color c2 = new Color(219, 203, 187);
        g2d.setColor(c2);
        g2d.fillOval(90, 110, 200, 170);

        g2d.fillOval(70, 170, 40, 50);
        g2d.fillOval(270, 170, 40, 50);


        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.drawOval(90, 110, 200, 170);

        Color c3 = new Color(191, 149, 37);
        g2d.setColor(c3);
        g2d.fillArc(80, 150, 50, 115, 90, 180);  //волосы
        g2d.fillArc(250, 150, 50, 115, 270, 180);
        g2d.setPaint(Color.black);
        g2d.drawArc(80, 150, 50, 115, 80, 190);  //контур
        g2d.drawArc(250, 150, 50, 115, 270, 190);
        g2d.drawLine(106, 150, 106, 265);
        g2d.drawLine(274, 150, 274, 265);
        g2d.setColor(c3);
        g2d.fillArc(90, 103, 201, 120, 0, 180);
        g2d.setPaint(Color.black);
        g2d.drawArc(90, 103, 201, 120, 0, 180);

        g2d.setColor(c3);
        g2d.fillOval(70, 80, 60, 60);
        g2d.fillOval(250, 80, 60, 60);
        g2d.setPaint(Color.black);
        g2d.drawOval(70, 80, 60, 60);
        g2d.drawOval(250, 80, 60, 60);


        g2d.drawLine(191, 228, 191, 225);   // нос

        g2d.fillOval(130, 155, 45, 60);  //ресницы
        g2d.fillOval(205, 155, 45, 60);
        g2d.drawLine(135, 160, 140, 165);
        g2d.drawLine(240, 165, 245, 160);


        g2d.drawArc(176, 227, 15, 15, 180, 180);  //рот
        g2d.drawArc(191, 227, 15, 15, 180, 180);

        Color c4 = new Color(217, 217, 217);
        g2d.setColor(c4);
        g2d.fillOval(130, 160, 45, 60);
        g2d.fillOval(205, 160, 45, 60);

        Color c5 = new Color(211, 223, 2);
        g2d.setColor(c5);
        g2d.fillOval(130, 180, 45, 45);
        g2d.fillOval(205, 180, 45, 45);


        g2d.setPaint(Color.black);
        g2d.drawArc(130, 180, 45, 45, 305, 290);
        g2d.drawArc(205, 180, 45, 45, 305, 290);

        g2d.fillOval(140, 190, 25, 25);
        g2d.fillOval(215, 190, 25, 25);

        g2d.fillArc(130, 180, 45, 45, 330, 240);
        g2d.fillArc(205, 180, 45, 45, 330, 240);

        g2d.setColor(c4);
        g2d.fillOval(137, 176, 25, 15);  //блики
        g2d.fillOval(212, 176, 25, 15);


        g2d.setPaint(Color.black);
        g2d.drawArc(130, 140, 50, 55, 70, 40);  //брови
        g2d.drawArc(200, 140, 50, 55, 70, 40);


    }
}