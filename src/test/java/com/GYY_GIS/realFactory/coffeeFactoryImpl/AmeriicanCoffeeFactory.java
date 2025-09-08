package com.GYY_GIS.realFactory.coffeeFactoryImpl;

import com.GYY_GIS.realFactory.AmericanCoffee;
import com.GYY_GIS.realFactory.Coffee;
import com.GYY_GIS.realFactory.CoffeeFactory;

public class AmeriicanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
