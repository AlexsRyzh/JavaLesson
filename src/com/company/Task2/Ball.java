package com.company.Task2;

public class Ball {
    private String type = "basketball";
    private String color = "Orange";
    private int radius;

    public Ball(int radius) {
        this.radius = radius;
    }

    public Ball(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Ball(String type, String color, int radius) {
        this.type = type;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" + '\n'+
                "  type = " + type + '\n' +
                "  color = " + color + '\n' +
                "  radius = " + radius +'\n'+
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void jump(){
        System.out.println("Jump Jump");
    }
}
