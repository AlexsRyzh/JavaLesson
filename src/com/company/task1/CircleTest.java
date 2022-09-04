package com.company.task1;

public class CircleTest {
    public static void test1(){
        System.out.println("Начало 1 теста");
        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.setRadius(10);
        circle.setBorderColor("Black");
        System.out.println(circle);
        System.out.println("Конец 1 теста");
        System.out.println();
    }
    public static void test2(){
        System.out.println("Начало 2 теста");
        Circle circle = new Circle(12,5);
        System.out.println(circle);
        circle.setBorderColor("Green");
        circle.setBorderStyle("Desh");
        circle.setBorderWidth(2);
        System.out.println(circle);
        System.out.println("Конец 2 теста");
        System.out.println();
    }
    public static void main(String[] args) {
        test1();
        test2();
    }
}
