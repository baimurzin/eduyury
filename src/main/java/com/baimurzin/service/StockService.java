package com.baimurzin.service;

import com.baimurzin.model.Good;
import com.baimurzin.model.Stock;

public interface StockService<T extends Good> {

    /**
     * Считаем товары в магазине
     * @param stock
     * @return
     */
    long countGoods(Stock<T> stock);


    /**
     * Считаем стоимость товаров
     * @param stock
     * @return
     */
    Double countPrice(Stock<T> stock);
}
