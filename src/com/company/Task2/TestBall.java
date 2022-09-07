package com.company.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10,120);

        ///Ball Test
        System.out.println("Ball------------------------");
        System.out.println(ball);

        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.setX(120);
        ball.setY(10);
        ball.setXY(10,10);
        System.out.println(ball);

        ball.move(10,20);

        System.out.println(ball);
        System.out.println("Ball------------------------");
    }
}
