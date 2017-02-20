package com.cbf4life.观察者模式;

import java.util.Observer;

/**
 * Created by 王萍 on 2017/2/20 0020.
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
//定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();

//我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
//然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();

        System.out.println("==================================");
        System.out.println();

        Thread.sleep(2000);

        hanFeiZi.haveFun();
    }
}
