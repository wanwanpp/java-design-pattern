package com.wp.适配器模式;

/**
 * Created by 王萍 on 2017/2/19 0019.
 */

//大灰狼
public class TimWolf implements Wolf {

    public TimWolf() {
        System.out.println("我是大灰狼");
    }

    @Override
    public void eat() {
        System.out.println("我要吃小羊");
    }

    @Override
    public void run() {
        System.out.println("大灰狼跑得很快");
    }
}
