package com.company;

import javax.swing.*;
import java.awt.*;

/* Класс, который будет рисовать элементы*/
class Canvas extends JComponent {

    /*Метод, перерисовывающий элемент внутри окна
     *при обновлении*/
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;

        Background background = new Background();
        background.background(g2d);

        Body body = new Body();
        body.body(g);

        Face face = new Face();
        face.face(g);

        g2d.setPaint(Color.black);
        g2d.drawString("Ульяна Шабунина", 145, 20);


        super.repaint();
    }
}