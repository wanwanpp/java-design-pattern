package com.wp.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王萍 on 2017/2/19 0019.
 */
public class Folder extends File {

    private List<File> files =new ArrayList<File>();

    public Folder(String name) {
        super(name);
    }


    @Override
    public void display() {
        for (File file:files){
            file.display();
        }
    }

    public void add(File file){
        files.add(file);
    }

    public void remove(File file){
        files.remove(file);
    }
}
