package com.wp.代理模式;

/**
 * Created by 王萍 on 2017/2/9 0009.
 */

/**
 * 目标类，被代理对象
 */
public class Teacher implements DealThings {

    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }

    @Override
    public void manage() {
        System.out.println(student.getName()+"你别闹了。");
    }

    @Override
    public void arrangeWork() {
        System.out.println(student.getName()+"今晚回去把第三单元作业做了。");

    }

    @Override
    public void receiveHomework() {
        System.out.println(student.getName()+"快把作业交上来。");
    }
}
