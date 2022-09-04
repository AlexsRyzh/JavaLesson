package com.company.task2;

public class Head {
    private String hairСolor;
    private String eyesColor;
    private int hairLength;
    private String lipColor;

    public Head(String hairСolor, String eyesColor, int hairLength, String lipColor) {
        this.hairСolor = hairСolor;
        this.eyesColor = eyesColor;
        this.hairLength = hairLength;
        this.lipColor = lipColor;
    }

    public String getHairСolor() {
        return hairСolor;
    }

    public void setHairСolor(String hairСolor) {
        this.hairСolor = hairСolor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public String getLipColor() {
        return lipColor;
    }

    public void setLipColor(String lipColor) {
        this.lipColor = lipColor;
    }

    public void turningHeadLeft(){
        System.out.println("Повернули голову влево");
    }
    public void turningHeadRight(){
        System.out.println("Повернули голову вправо");
    }
    public void turningHeadUp(){
        System.out.println("Повернули голову вверх");
    }
    public void turningHeadDown(){
        System.out.println("Повернули голову вниз");
    }
}
