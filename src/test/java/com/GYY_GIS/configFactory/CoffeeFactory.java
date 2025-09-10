package com.GYY_GIS.configFactory;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    //创建双列集合，用于存储配置文件中的类
    private static HashMap<String,Coffee> coffeeMap = new HashMap<>();
    //加载配置文件
    static{
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            //从p中加载全类名并加载对象
            Set<Object> keys = p.keySet();//获取所有键
            //System.out.println(keys);
            for(Object key:keys){
                String forName = p.getProperty((String)key);//获取键对应的值
                //System.out.println(forName);

                //利用反射创建对象
                Class clazz = Class.forName(forName);
                Coffee coffee = (Coffee)clazz.newInstance();//调用无参构造函数创建对象
                coffeeMap.put((String)key,coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    //根据名称创建对象
    public static Coffee getCoffee(String coffeeName){
        return coffeeMap.get(coffeeName);
    }
}
