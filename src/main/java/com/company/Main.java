package com.company;

public class Main {
    public static void main(String[] args) {
        Pan pan  = new Pan(1200, "Red", "Metal",false);
        Plate plate = new Plate(1232, "Brown", "clay", true);

        System.out.println(pan.getType());
        System.out.println(pan.getColor());
        System.out.println(pan.isClear());
        pan.wash();
        System.out.println(pan.isClear());

        System.out.println();

        System.out.println(plate.getMaterial());
        System.out.println(plate.getPrice());
        plate.throwDish();

        System.out.println();
    }
}
