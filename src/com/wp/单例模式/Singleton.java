package com.wp.单例模式;

/**
 * 这种单例模式，在多线程环境下会出现问题，可能会创建出多个对象，而非单个对象。
 */
public class Singleton {
    //利用静态变量来记录Singleton的唯一实例
    private static Singleton uniqueInstance;
    
    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     * 如Singleton singleton = new Singleton();   防止通过此代码进行对象的创建。
     */
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        
        return uniqueInstance;
    }
    
}