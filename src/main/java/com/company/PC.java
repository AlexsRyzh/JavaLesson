package com.company;

public class PC implements Priceable{

    private int price;

    public PC(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
