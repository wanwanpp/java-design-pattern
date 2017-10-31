package com.wp.单例模式;

public class Singleton3 {
    /*
     * 利用静态变量来记录Singleton的唯一实例
     * volatile 关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量
     * 
     */
    private volatile static Singleton3 uniqueInstance;
    
    /*
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton3(){
        
    }
    
    /*
     * 
     * 检查实例，如果不存在，就进入同步区域
     * 能够减少synchronized的使用，只有每次新建单例对象时才进入。
     */
    public static Singleton3 getInstance(){
        if(uniqueInstance == null){
            synchronized(Singleton3.class){    //进入同步区域
                if(uniqueInstance == null){     //在检查一次，如果为null，则创建
                    uniqueInstance  = new Singleton3();
                }
            }
        }
        
        return uniqueInstance;
    }
    
}