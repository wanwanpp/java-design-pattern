package com.wp.单例模式;

public class Singleton2 {
    /*
     * 利用静态变量来记录Singleton的唯一实例
     * 直接初始化静态变量，这样就可以确保线程安全了
     */
    private static Singleton2 uniqueInstance = new Singleton2();
    

    private Singleton2(){
        
    }
    
    public static Singleton2 getInstance(){
        return uniqueInstance;
    }
    
}