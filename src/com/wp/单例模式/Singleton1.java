package com.wp.单例模式;

public class Singleton1 {
    private static Singleton1 uniqueInstance;
    
    private Singleton1(){
        
    }

    /**
     * 在创建对象的方法上添加synchronized关键字以确保多线程安全。
     * 但是每次使用getInstance方法时都会加上锁，会占用部分资源。
     * @return
     */
    public static synchronized Singleton1 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton1();
        }
        
        return uniqueInstance;
    }
    
}