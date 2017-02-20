package com.cbf4life.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 王萍 on 2017/2/20 0020.
 */
public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object obj) {
        System.out.println("李斯：观察到李斯活动，开始向老板汇报了...");
        this.reportToQiShiHuang(obj.toString());
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }

    private void reportToQiShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
