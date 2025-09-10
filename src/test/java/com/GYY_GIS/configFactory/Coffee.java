package com.GYY_GIS.configFactory;

public abstract class Coffee {
    public abstract String getName();
    public void addMilk(){
        System.out.println("Add milk");
    }
    public void addSugar(){
        System.out.println("Add sugar");
    }
}
