package com.GYY_GIS.realFactory.coffeeFactoryImpl;

import com.GYY_GIS.realFactory.Coffee;
import com.GYY_GIS.realFactory.CoffeeFactory;
import com.GYY_GIS.realFactory.LatteCoffee;

public class LatterCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
