package com.GYY_GIS.factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        //创建工厂生产咖啡
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
//        Coffee coffee = factory.createCoffee(type);
        //静态工厂方式
        Coffee coffee = SimpleCoffeeFactory.createCoffee("Latte");
        //加料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
