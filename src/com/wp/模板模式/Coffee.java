package com.wp.模板模式;

public class Coffee extends CaffeineBeverage{

    void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
    }

    void brew() {
        System.out.println("Dripping Coffee through filter...");
    }

}