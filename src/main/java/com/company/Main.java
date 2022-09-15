package com.company;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(25000);
        PC pc  = new PC(1000);

        System.out.println("Laptop price: "+laptop.getPrice());
        System.out.println("PC price: "+ pc.getPrice());

    }
}
