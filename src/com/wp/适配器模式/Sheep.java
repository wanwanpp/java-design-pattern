package com.wp.适配器模式;

/**
 * Created by 王萍 on 2017/2/19 0019.
 */

//羊
public class Sheep {

    public Sheep() {
        System.out.println("我是小绵羊");
    }

    public void graze(){
        System.out.println("我要吃青草");
    }

    public void run(){
        System.out.println("小绵羊跑得很慢");
    }
}
