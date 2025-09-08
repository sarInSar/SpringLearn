package com.GYY_GIS.abstractFactory.store;


import com.GYY_GIS.abstractFactory.DessertObject.Dessert;
import com.GYY_GIS.abstractFactory.Factory.Factory;
import com.GYY_GIS.abstractFactory.coffeeObject.Coffee;


public class Store {
    private Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }
    public void order(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
        Dessert dessert = factory.createDessert();
        dessert.show();
    }
}
