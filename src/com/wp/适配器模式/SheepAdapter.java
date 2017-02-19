package com.wp.适配器模式;

/**
 * Created by 王萍 on 2017/2/19 0019.
 */
public class SheepAdapter implements Wolf {

    private Sheep sheep;

    public SheepAdapter(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public void eat() {
        System.out.println("大灰狼披羊皮");
        sheep.graze();
    }

    @Override
    public void run() {
        System.out.println("大灰狼披羊皮");
        sheep.run();
    }
}
