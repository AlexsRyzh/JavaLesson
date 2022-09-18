package com.company;

import java.awt.*;
import java.util.Random;

public class Circle extends Shape{
    private int radius;


    public Circle() {
        Random rand = new Random();
        this.radius = rand.nextInt(40,100);
        color = new Color(
                rand.nextInt(255),
                rand.nextInt(255),
                rand.nextInt(255)
        );
        X = rand.nextInt(100,900);
        Y = rand.nextInt(100,600);
    }

    public int getRadius() {
        return radius;
    }
    public Color getColor() { return color; }
    public int getXPos() {
        return X;
    }
    public int getYPos() {
        return Y;
    }

    @Override
    public String toString() {
        return "Circle";
    }

}
