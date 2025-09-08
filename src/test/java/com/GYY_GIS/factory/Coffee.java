package com.GYY_GIS.factory;


public abstract class Coffee {

    private String name;
    public abstract String getName();
    public void addSugar(){
        System.out.println("加糖");
    }
    public void addMilk(){
        System.out.println("加奶");
    }
}
