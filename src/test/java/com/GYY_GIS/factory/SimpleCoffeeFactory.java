package com.GYY_GIS.factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        switch (type) {
            case "American": {
                coffee = new AmericanCoffee();
                break;
            }
            case "Latte": {
                coffee = new LatteCoffee();
                break;
            }
            default: {
                System.out.println("咖啡类型只有 American 和 Latte 两种");
            }
        }
        coffee.getName();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
