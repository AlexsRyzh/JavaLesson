package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main extends JPanel
{
    private ArrayList<Shape> shapes = new ArrayList<>();
    public static void main(String[] args) throws Exception
    {
        JFrame f = new JFrame();
        f.setContentPane(new Main());
        f.setSize(1100,800);
        f.setResizable(false);
        f.setVisible(true);

    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Random rand = new Random();
        Graphics2D g2d = (Graphics2D) g;
        for (int i =0; i<20; i++){
            int var = rand.nextInt(3);
            if (var == 1){
                shapes.add(new Circle());
            }else if (var == 2){
                shapes.add(new Rectangle());
            }else{
                shapes.add(new Star());
            }

        }
        for (int i=0; i<20; i++){
            if (shapes.get(i).getClass().toString().equals("class com.company.Circle")){
                Circle circle = (Circle)shapes.get(i);
                g2d.setColor(circle.getColor());
                g2d.fillOval(circle.getXPos(),circle.getYPos(),circle.getRadius(),circle.getRadius());
            }else if (shapes.get(i).getClass().toString().equals("class com.company.Rectangle")){
                Rectangle rect = (Rectangle)shapes.get(i);
                g2d.setColor(rect.getColor());
                g2d.fillRect(
                        rect.getXPos(),
                        rect.getYPos(),
                        rect.getWidth(),
                        rect.getHeight());
            }else{
                Star star = (Star) shapes.get(i);
                g2d.fill(star.drawStar());
            }

        }


    }
}