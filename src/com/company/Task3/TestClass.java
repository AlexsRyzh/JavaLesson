package com.company.Task3;

import com.company.Task2.Circle;
import com.company.Task2.Rectangle;
import com.company.Task2.Shape;
import com.company.Task2.Square;

public class TestClass {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); /// Cycle.toString()
        System.out.println(s1.getArea()); // Cycle.getArea()
        System.out.println(s1.getPerimeter()); // Cycle.getPerimeter()
        System.out.println(s1.getColor()); // Shape.getColor()
        System.out.println(s1.isFilled());// Shape.isFilled()
        ///System.out.println(s1.getRadius());
        ///Не работает потому что в классе Shape нету метода getRadius

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1); /// Circle.toString()
        System.out.println(c1.getArea()); // Cycle.getArea()
        System.out.println(c1.getPerimeter()); // Cycle.getPerimeter()
        System.out.println(c1.getColor()); // Shape.getColor()
        System.out.println(c1.isFilled()); // Shape.isFilled()
        System.out.println(c1.getRadius()); // Cycle.getRadius()

        ///Shape s2 = new Shape(); /// Мы не можем создавать экземпляр абстрактного класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3); //Rectangle.toString()
        System.out.println(s3.getArea()); // Rectangle.getArea()
        System.out.println(s3.getPerimeter()); // Rectangle.getPerimeter()
        System.out.println(s3.getColor()); // Shape.getColor()
        ///System.out.println(s3.getLength()); /// В классе Shape нету метода getLength

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1); //Rectangle.toString(
        System.out.println(r1.getArea()); // Rectangle.getArea()
        System.out.println(r1.getColor()); // Shape.getColor()
        System.out.println(r1.getLength()); // Rectangle.getLength()

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // Square.toString()
        System.out.println(s4.getArea()); // Square.getArea()
        System.out.println(s4.getColor()); // Shape.getColor()
        ///System.out.println(s4.getSide()); // В классе Shape нету метода getSide()

        // Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2); // Square.toString()
        System.out.println(r2.getArea()); // Square.getArea()
        System.out.println(r2.getColor()); // Shape.getColor()
        //System.out.println(r2.getSide()); // В классе Rectangle нет метода getSide()
        System.out.println(r2.getLength()); // Rectangle.getLength()

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1); //Square.toString()
        System.out.println(sq1.getArea()); // Square.getArea()
        System.out.println(sq1.getColor()); // Shape.getColor()
        System.out.println(sq1.getSide()); // Square.getSide()
        System.out.println(sq1.getLength()); // Rectangle.getLength()
    }
}
