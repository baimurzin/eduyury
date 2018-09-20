package com.baimurzin.model;

import java.util.List;

public class Stock<T extends Good> {

    private List<T> goodList;

    public Stock() {
    }

    public Stock(List<T> goodList) {
        this.goodList = goodList;
    }

    public List<T> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<T> goodList) {
        this.goodList = goodList;
    }
}
