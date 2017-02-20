package com.wp.装饰者模式;

//焦炒咖啡
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    public double cost() {
        return 1.05;
    }

}