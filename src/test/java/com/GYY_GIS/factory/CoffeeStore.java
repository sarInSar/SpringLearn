package com.GYY_GIS.factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        return factory.createCoffee(type);
    }
}
