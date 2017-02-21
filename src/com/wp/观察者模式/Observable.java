package com.wp.观察者模式;


public interface Observable {
    /**
     * 添加观察者
     * @param observer
     */
    public void addObserver(Observer observer);
    
    /**
     * 删除观察者
     * @param observer
     */
    public void removeOberver(Observer observer);
    
    /**
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
     */
    public void notifyObserver();
}