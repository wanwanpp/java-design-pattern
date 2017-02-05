package com.cbf4life.strategy;

/**
 * Created by 王萍 on 2016/11/28 0028.
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
