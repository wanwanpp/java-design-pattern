package com.wp.模板模式;

public abstract class CaffeineBeverageWithHook {
    
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){    //如果顾客需要添加调料，我们才会调用addCondiments()方法
            addCondiments();
        }
    }
    
    abstract void brew();
    
    abstract void addCondiments();
    
    void boilWater(){
        System.out.println("Boiling water...");
    }
    
    void pourInCup(){
        System.out.println("Pouring into Cup...");
    }
    
    public boolean customerWantsCondiments(){
        return true;
    }
}