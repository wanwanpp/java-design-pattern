package com.wp.代理模式;

/**
 * Created by 王萍 on 2017/2/9 0009.
 */

/**
 * 引用了目标对象，即被代理对象。
 */
public class Master implements DealThings {

    private Teacher teacher;

    public Master(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void manage() {
        teacher.manage();
    }

    @Override
    public void arrangeWork() {
        teacher.arrangeWork();
    }

    @Override
    public void receiveHomework() {
        teacher.receiveHomework();
    }
}
