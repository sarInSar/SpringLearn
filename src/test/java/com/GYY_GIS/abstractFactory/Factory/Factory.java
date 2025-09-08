package com.GYY_GIS.abstractFactory.Factory;

import com.GYY_GIS.abstractFactory.DessertObject.Dessert;
import com.GYY_GIS.abstractFactory.coffeeObject.Coffee;

public interface Factory {
    public abstract Dessert createDessert();
    public abstract Coffee createCoffee();
}
