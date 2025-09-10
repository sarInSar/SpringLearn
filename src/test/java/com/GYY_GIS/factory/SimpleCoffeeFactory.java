package com.GYY_GIS.factory;

public  class SimpleCoffeeFactory {
    private static Coffee coffee = null;

    public static Coffee createCoffee(String type) {
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
        return coffee;
    }


}
