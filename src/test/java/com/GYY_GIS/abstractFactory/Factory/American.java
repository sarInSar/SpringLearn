package com.GYY_GIS.abstractFactory.Factory;

import com.GYY_GIS.abstractFactory.DessertObject.Dessert;
import com.GYY_GIS.abstractFactory.DessertObject.MatchaMousse;
import com.GYY_GIS.abstractFactory.coffeeObject.AmericanCoffee;
import com.GYY_GIS.abstractFactory.coffeeObject.Coffee;

public class American implements Factory {
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
