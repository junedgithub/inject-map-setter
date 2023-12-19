package com.ty;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Shop shop = (Shop)applicationContext.getBean("myShop");
        System.out.println("Shop Name: "+shop.getName());
        System.out.println("=================List Of Items=====================");
        Map<String, Double> items = shop.getItems();
        for (Map.Entry<String, Double> item : items.entrySet()) {
			System.out.println(item.getKey()+"====>"+item.getValue());
		}
	}
}
