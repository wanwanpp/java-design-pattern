package com.wp.模板模式;

public abstract class CaffeineBeverage {
    
    /**
     * 
     * @desc 
     *             模板方法，用来控制泡茶与冲咖啡的流程
     *             申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
     * @return void
     */
    final void prepareRecipe(){
        //热水
        boilWater();
        //用沸水冲咖啡或者泡茶叶
        brew();
        //把咖啡或者茶倒入杯子里
        pourInCup();
        //添加佐料
        addCondiments();
    }
    
    /**
     * @desc 
     *          将brew()、addCondiment()声明为抽象类，具体操作由子类实现
     * @return void
     */
    abstract void brew();
    
    abstract void addCondiments();
    
    void boilWater(){
        System.out.println("Boiling water...");
    }
    
    void pourInCup(){
        System.out.println("Pouring into Cup...");
    }
}