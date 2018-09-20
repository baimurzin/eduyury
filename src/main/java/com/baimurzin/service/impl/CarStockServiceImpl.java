package com.baimurzin.service.impl;

import com.baimurzin.enums.Color;
import com.baimurzin.model.Car;
import com.baimurzin.model.Good;
import com.baimurzin.model.Stock;
import com.baimurzin.service.CarStockService;
import com.baimurzin.service.StockService;

import java.util.Map;
import java.util.stream.Collectors;

public class CarStockServiceImpl implements CarStockService<Car>, StockService<Car> {

    public float countAverageSpeed(Stock<Car> stock) {
        float avgSpeed = stock.getGoodList()
                .stream()
                .map(Car::getTimeTo100)
                .reduce((aFloat, aFloat2) -> aFloat + aFloat2)
                .orElse(0f);
        return avgSpeed / stock.getGoodList().size();
    }

    public Map<Color, Long> countStatByColor(Stock<Car> stock) {
        Map<Color, Long> collect = stock.getGoodList().stream()
                .collect(Collectors.groupingBy(Car::getColor, Collectors.counting()));
        return collect;
    }

    @Override
    public long countGoods(Stock<Car> stock) {
        return stock.getGoodList().size();
    }

    @Override
    public Double countPrice(Stock<Car> stock) {
        return stock.getGoodList()
                .stream()
                .map(Good::getPrice)
                .reduce((aDouble, aDouble2) -> aDouble + aDouble2)
                .orElse(0.0);
    }
}
