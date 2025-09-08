package com.GYY_GIS.abstractFactory.Factory;

import com.GYY_GIS.abstractFactory.DessertObject.Dessert;
import com.GYY_GIS.abstractFactory.DessertObject.Tiramisu;
import com.GYY_GIS.abstractFactory.coffeeObject.Coffee;
import com.GYY_GIS.abstractFactory.coffeeObject.LatteCoffee;

public class Ltaly implements Factory{
    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
