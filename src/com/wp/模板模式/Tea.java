package com.wp.模板模式;

public class Tea extends CaffeineBeverage{

    void addCondiments() {
        System.out.println("Adding Lemon...");
        
    }

    void brew() {
        System.out.println("Steeping the tea...");
    }

}