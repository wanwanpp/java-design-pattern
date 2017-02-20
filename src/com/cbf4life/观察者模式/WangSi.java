package com.cbf4life.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 王萍 on 2017/2/20 0020.
 */
public class WangSi implements Observer {
    @Override
    public void update(Observable o, Object obj) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
        this.cry(obj.toString());
        System.out.println("王斯：真真的哭死了...\n");
    }

    private void cry(String context){
        System.out.println("王斯：因为"+context+"，——所以我悲伤呀！");
    }
}
