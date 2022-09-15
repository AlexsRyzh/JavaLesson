package com.company;

public class Plate extends Dish {
    private String type = "Plate";


    public Plate(int price, String color, String material, boolean isClear) {
        super(price, color, material, isClear);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void wash() {
        System.out.println("You washed the plate!!");
        setClear(true);
    }

    @Override
    public void throwDish() {
        System.out.println("You throw plate!!");
        System.out.println("It broke!!");
    }
}
