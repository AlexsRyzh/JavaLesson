package com.company.Task4;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +'\n'+
                "  x=" + x + '\n'+
                "  y=" + y +'\n'+
                "  xSpeed=" + xSpeed +'\n'+
                "  ySpeed=" + ySpeed +'\n'+
                '}';
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }




    //// For task5
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }
}
