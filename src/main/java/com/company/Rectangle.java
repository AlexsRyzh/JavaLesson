package com.company;

import java.awt.*;
import java.util.Random;


public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        Random rand = new Random();
        this.width = rand.nextInt(50,100);
        this.height = rand.nextInt(50,100);
        color = new Color(
                rand.nextInt(255),
                rand.nextInt(255),
                rand.nextInt(255)
        );
        X = rand.nextInt(100,900);
        Y = rand.nextInt(100,600);
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
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
        return "rect";
    }
}
