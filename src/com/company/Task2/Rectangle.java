package com.company.Task2;


public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +'\n'+
                "  width = " + width +'\n'+
                "  length = " + length +'\n'+
                "  color = " + color + '\n' +
                "  filled = " + filled +'\n'+
                '}';
    }
}
