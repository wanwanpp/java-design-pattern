package com.wp.代理模式;

/**
 * Created by 王萍 on 2017/2/9 0009.
 */
public class Client {

    /**
     * 班长代理老师做事。
     */

    public static void main(String[] args) {

        Student student = new Student("wanwanpp");
        Teacher teacher = new Teacher(student);
        Master master = new Master(teacher);

        master.manage();
        master.arrangeWork();
        master.receiveHomework();
    }

}
