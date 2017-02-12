package com.wp.工厂方法模式;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        if ("cheese".equals(item)) {
            pizza = new NYStyleCheesePizza();
        }
//        else if("veggie".equals(item)){
//            pizza = new NYStyleVeggiePizza();
//        }
//        else if("clam".equals(item)){
//            pizza = new NYStyleClamPizza();
//        }
//        else if("pepperoni".equals(item)){
//            pizza = new NYStylePepperoniPizza();
//        }

        return pizza;
    }
}