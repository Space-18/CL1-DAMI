package com.pizzadelivery.cl1_dami.model;

import android.widget.ImageView;

public class Picture {
    private int picture;
    private String pizzaName;
    private String pizzaPrice;
    private String pizzaStock;

    public Picture(){

    }

    public Picture(int picture, String pizzaName, String pizzaPrice, String pizzaStock) {
        this.picture = picture;
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaStock = pizzaStock;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(String pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public String getPizzaStock() {
        return pizzaStock;
    }

    public void setPizzaStock(String pizzaStock) {
        this.pizzaStock = pizzaStock;
    }
}
