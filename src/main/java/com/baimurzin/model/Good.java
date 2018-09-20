package com.baimurzin.model;


/**
 * Товар - любой
 */
public abstract class Good {
    protected Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
