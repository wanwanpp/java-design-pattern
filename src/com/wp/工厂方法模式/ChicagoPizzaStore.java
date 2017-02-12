package com.wp.工厂方法模式;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }
//        else if("clam".equals(type)){
//            pizza = new ChicagoStyleClamPizza();
//        }
//        else if("pepperoni".equals(type)) {
//            pizza = new ChicagoStylePepperoniPizza();
//        }
//        else if("veggie".equals(type)){
//            pizza = new ChicagoStyleVeggiePizza();
//        }
        return pizza;
    }

}