package com.cbf4life.singleton1;

/**
 * Created by 王萍 on 2016/11/28 0028.
 */
public class Emperor {
    private static Emperor emperor = null;

    private Emperor(){

    }

//    @SuppressWarnings("all")
//    public class SingletonPattern {
//        private static final SingletonPattern singletonPattern= new
//                SingletonPattern();
//        // 限制住不能直接产生一个实例
//        private SingletonPattern(){
//        }
//        public synchronized static SingletonPattern getInstance(){
//            return singletonPattern;
//        }
//    }
    /**
     * 多线程情况下，以下方法可能会new出两个对象，或者更多的对象.可以通过以上方法解决
     * @return
     */
    public static Emperor getInstance(){
        if (emperor==null){
            emperor=new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("我就是皇帝某某某....");
    }
}
