package com.GYY_GIS.realFactory;

public class CoffeeStore {
    private CoffeeFactory factory = null;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
