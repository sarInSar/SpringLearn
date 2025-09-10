package com.GYY_GIS.factory;

public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        System.out.println(coffeeStore.orderCoffee("Latte").getName());
    }
}
