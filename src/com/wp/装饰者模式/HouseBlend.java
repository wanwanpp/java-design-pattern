package com.wp.装饰者模式;

//首选咖啡
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }
    
    @Override
    public double cost() {
        return 0.89;
    }

}