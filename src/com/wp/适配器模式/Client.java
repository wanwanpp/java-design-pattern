package com.wp.适配器模式;

/**
 * Created by 王萍 on 2017/2/19 0019.
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("我是真的狼");
        Wolf timWolf = new TimWolf();
        timWolf.eat();
        timWolf.eat();
        System.out.println("================================");
        System.out.println("我是狼扮羊");
        Sheep sheep = new Sheep();
        Wolf fakeSheep = new SheepAdapter(sheep);
        fakeSheep.eat();
        fakeSheep.run();
    }
}
