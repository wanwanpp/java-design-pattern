package com.cbf4life.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 王萍 on 2017/2/20 0020.
 */
public class LiuSi implements Observer {
    @Override
    public void update(Observable o, Object obj) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了...");
        this.happy(obj.toString());
        System.out.println("刘斯：真被乐死了\n");
    }

    private void happy(String context){
        System.out.println("刘斯：因为" +context+",——所以我快乐呀！" );
    }
}
