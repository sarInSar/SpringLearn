package com.GYY_GIS.factory;

public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee= coffeeStore.orderCoffee("Latte");
        System.out.println(coffee.getName());
    }
}
