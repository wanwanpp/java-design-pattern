package com.wp.工厂方法模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;        //名称
    protected String dough;       //面团
    protected String sause;       //酱料
    protected List<String> toppings = new ArrayList<String>();       //佐料
    
    
    public void prepare() {
        System.out.println("准备 "+name);
        System.out.println("弄好面团");
        System.out.println("加糖");
        System.out.println("添加佐料");
        for(int i = 0;i < toppings.size();i++){
            System.out.println("   "+toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("把披萨切成斜片");
    }

    public void box() {
        System.out.println("把披萨放到官方披萨店的盒子");
    }
    
    public String getName(){
        return name;
    }
}