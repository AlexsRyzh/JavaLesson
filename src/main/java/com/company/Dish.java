package com.company;

public abstract class Dish {
    private int price;
    private String color;
    private String material;
    private boolean isClear;

    public Dish(int price, String color, String material, boolean isClear) {
        this.price = price;
        this.color = color;
        this.material = material;
        this.isClear = isClear;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isClear(){
        return isClear;
    };

    public void setClear(boolean newState){
        isClear = newState;
    }

    public abstract String getType();
    public abstract void wash();
    public abstract void throwDish();

}
