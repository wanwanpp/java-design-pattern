package com.wp.工厂方法模式;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "芝加哥口味奶酪比萨饼";
        dough = "厚皮比萨面团";
        sause = "李子番茄酱";
        
        toppings.add("马苏里拉奶酪丝");
    }
    
    public void cut(){
        System.out.println("把奶酪切成方形片");
    }
}