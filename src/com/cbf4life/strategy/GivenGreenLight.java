package com.cbf4life.strategy;

/**
 * Created by 王萍 on 2016/11/28 0028.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
