package com.GYY_GIS.abstractFactory.coffeeObject;

public abstract class Coffee {
    public abstract String getName();
    public void addMilk(){
        System.out.println("Add milk");
    }
    public void addSugar(){
        System.out.println("Add sugar");
    }
}
