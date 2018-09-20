package com.baimurzin.model;

import com.baimurzin.enums.*;

public abstract class Car extends Good {

    protected String brand;
    protected String model;
    protected Color color;
    protected Transmission transmission;
    protected Engine engine;
    protected float timeTo100;
    protected Body body;
    protected Wheel wheel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getTimeTo100() {
        return timeTo100;
    }

    public void setTimeTo100(float timeTo100) {
        this.timeTo100 = timeTo100;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
