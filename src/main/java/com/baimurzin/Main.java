package com.baimurzin;

import com.baimurzin.enums.Body;
import com.baimurzin.enums.Color;
import com.baimurzin.enums.Engine;
import com.baimurzin.enums.Transmission;
import com.baimurzin.model.BMW;
import com.baimurzin.model.Car;
import com.baimurzin.model.LeftWheelCar;
import com.baimurzin.model.Stock;
import com.baimurzin.service.impl.CarStockServiceImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car wheelCar = new LeftWheelCar();
        wheelCar.setBody(Body.SEDAN);
        wheelCar.setBrand("VW");
        wheelCar.setColor(Color.BLUE);
        wheelCar.setEngine(Engine.DIESEL);
        wheelCar.setTimeTo100(8);
        wheelCar.setModel("jetta");
        wheelCar.setPrice(10000.0);
        wheelCar.setTransmission(Transmission.AUTOMATIC);


        Car bmw = new BMW();
        bmw.setBody(Body.SEDAN);
        bmw.setColor(Color.GREEN);
        bmw.setEngine(Engine.DIESEL);
        bmw.setTimeTo100(4);
        bmw.setModel("5");
        bmw.setPrice(13000.0);
        bmw.setTransmission(Transmission.AUTOMATIC);

        Car bmw3 = new BMW();
        bmw3.setBody(Body.SEDAN);
        bmw3.setColor(Color.RED);
        bmw3.setEngine(Engine.DIESEL);
        bmw3.setTimeTo100(6);
        bmw3.setPrice(11000.0);
        bmw3.setModel("3");
        bmw3.setTransmission(Transmission.AUTOMATIC);

        Car mercCar = new LeftWheelCar();
        mercCar.setBody(Body.SEDAN);
        mercCar.setBrand("MB");
        mercCar.setPrice(15000.0);
        mercCar.setColor(Color.RED);
        mercCar.setEngine(Engine.PETROL);
        mercCar.setTimeTo100(4);
        mercCar.setModel("S");
        mercCar.setTransmission(Transmission.AUTOMATIC);



        // создаем сток
        Stock stock = new Stock();
        // создаем сток сервис
        CarStockServiceImpl stockService = new CarStockServiceImpl();

        //заполняем сток

        stock.setGoodList(Arrays.asList(bmw, bmw3, mercCar, wheelCar));

        //считаем
        System.out.println("avg speed: " + stockService.countAverageSpeed(stock));
        System.out.println("goods count: " + stockService.countGoods(stock));
        System.out.println("price sum: " + stockService.countPrice(stock));
        System.out.println("stat by color: " + stockService.countStatByColor(stock));

//        RESULTS:
//        avg speed: 5.5
//        goods count: 4
//        price sum: 49000.0
//        stat by color: {RED=2, BLUE=1, GREEN=1}
        // todo find bugs and fix
    }
}
