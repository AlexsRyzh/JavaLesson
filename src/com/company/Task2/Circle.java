package com.company.Task2;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +'\n'+
                "  radius = " + radius +'\n'+
                "  color = " + color + '\n' +
                "  filled = " + filled +'\n'+
                '}';
    }
}
