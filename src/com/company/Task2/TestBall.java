package com.company.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5);
        Ball ball2 = new Ball("Red",5);

        ///Ball
        System.out.println();
        System.out.println(ball);
        ball.setColor("Green");
        System.out.println(ball.getColor());
        System.out.println(ball.getRadius());
        System.out.println(ball);
        System.out.println();

        ///Ball2
        System.out.println();
        System.out.println(ball2);
        ball2.setRadius(10);
        ball2.setType("football");
        System.out.println(ball2.getType());
        ball2.jump();
        System.out.println(ball2);
        System.out.println();
    }
}
