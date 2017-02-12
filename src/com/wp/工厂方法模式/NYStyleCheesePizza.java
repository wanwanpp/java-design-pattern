package com.wp.工厂方法模式;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "纽约风格奶酪比萨饼";
        dough = "脆薄面团";
        sause = "加番茄酱";
        
        toppings.add("奶酪");
    }

}