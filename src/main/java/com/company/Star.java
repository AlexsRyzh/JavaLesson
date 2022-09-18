package com.company;

import java.awt.*;
import java.awt.geom.Path2D;
import java.util.Random;
import javax.swing.*;

public class Star extends Shape{
    private double innerRadius;
    private double outerRadius;
    private int numRays;
    private double startAngleR;


    public Star() {
        Random rand = new Random();
        this.innerRadius = 20;
        this.outerRadius = 60;
        this.numRays = 8;
        this.startAngleR = 0;
        X = rand.nextInt(100,800);
        Y = rand.nextInt(100,600);
    }

    public java.awt.Shape drawStar(){
        Path2D p = new Path2D.Double();
        double deltaAngleR = Math.PI / numRays;
        for (int i = 0; i < numRays * 2; i++)
        {
            double angleR = startAngleR + i * deltaAngleR;
            double ca = Math.cos(angleR);
            double sa = Math.sin(angleR);
            double relX = ca;
            double relY = sa;
            if ((i & 1) == 0)
            {
                relX *= outerRadius;
                relY *= outerRadius;
            }
            else
            {
                relX *= innerRadius;
                relY *= innerRadius;
            }
            if (i == 0)
            {
                p.moveTo(X + relX, Y + relY);
            }
            else
            {
                p.lineTo(X + relX, Y + relY);
            }
        }
        p.closePath();
        return p;
    }

    public Color getColor(){
        return color;
    }
}
