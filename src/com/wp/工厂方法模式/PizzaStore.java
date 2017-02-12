package com.wp.工厂方法模式;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    /*
     * 创建pizza的方法交给子类去实现
     */
    abstract Pizza createPizza(String type);
}