package com.GYY_GIS.configFactory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.getCoffee("american");
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
