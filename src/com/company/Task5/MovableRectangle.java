package com.company.Task5;

import com.company.Task4.Movable;
import com.company.Task4.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight= new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "  x1"+ topLeft.getX() +'\n'+
                "  y1"+topLeft.getY() +'\n'+
                "  x2"+bottomRight.getX() +'\n'+
                "  y2"+bottomRight.getY() +'\n'+
                "  xSpeed"+topLeft.getxSpeed() +'\n'+
                "  ySpeed"+topLeft.getySpeed() +'\n'+
                "}";
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    ///Метод проверяет одинаковая ли скорость у точек
    public boolean sameSpeed(){
        if (topLeft.getySpeed() == bottomRight.getySpeed() &&
                topLeft.getxSpeed() == bottomRight.getySpeed() ){
            return true;
        }
        return false;
    }

}
