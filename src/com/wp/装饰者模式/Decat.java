package com.wp.装饰者模式;

public class Decat extends Beverage {
    public Decat(){
        description = "Decat";
    }
        
    @Override
    public double cost() {
        return 0.99;
    }

}