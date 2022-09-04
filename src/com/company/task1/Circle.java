package com.company.task1;

public class Circle {
    private int radius;
    private int borderWidth = 1;
    private String borderColor = "Red";
    private String borderStyle = "Solid";

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, int borderWidth) {
        this.radius = radius;
        this.borderWidth = borderWidth;
    }

    public Circle(int radius, int borderWidth, String borderColor) {
        this.radius = radius;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    public Circle(int radius, int borderWidth, String borderColor, String borderStyle) {
        this.radius = radius;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.borderStyle = borderStyle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getBorderStyle() {
        return borderStyle;
    }

    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", borderWidth=" + borderWidth +
                ", borderColor='" + borderColor + '\'' +
                ", borderStyle='" + borderStyle + '\'' +
                '}';
    }
}
