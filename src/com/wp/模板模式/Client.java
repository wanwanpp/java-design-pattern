package com.wp.模板模式;

/**
 * Created by 王萍 on 2017/2/10 0010.
 */

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("=======================");
        System.out.println("=======================");
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("=======================");
        System.out.println("=======================");

        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        coffeeHook.prepareRecipe();
    }
}
