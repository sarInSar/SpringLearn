package com.GYY_GIS.realFactory;


import com.GYY_GIS.realFactory.coffeeFactoryImpl.AmeriicanCoffeeFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setFactory(new AmeriicanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
