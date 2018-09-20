package com.baimurzin.service;

import com.baimurzin.enums.Color;
import com.baimurzin.model.Car;
import com.baimurzin.model.Stock;

import java.util.Map;

/**
 *
 */
public interface CarStockService<T extends Car> {

    float countAverageSpeed(Stock<T> stock);

    Map<Color, Long> countStatByColor(Stock<T> stock);
}
