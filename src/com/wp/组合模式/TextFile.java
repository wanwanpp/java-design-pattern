package com.wp.组合模式;

/**
 * Created by 王萍 on 2017/2/19 0019.
 */
public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("文本文件：名叫"+getName());
    }
}
