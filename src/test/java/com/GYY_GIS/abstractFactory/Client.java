package com.GYY_GIS.abstractFactory;

import com.GYY_GIS.abstractFactory.Factory.American;
import com.GYY_GIS.abstractFactory.store.Store;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        store.setFactory(new American());
        store.order();
    }
}
