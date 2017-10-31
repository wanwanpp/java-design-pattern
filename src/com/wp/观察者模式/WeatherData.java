package com.wp.观察者模式;

import java.util.ArrayList;
import java.util.List;

//被观察者
public class WeatherData implements Observable {
    private List<Observer> observers;
    private float tempterature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(tempterature, humidity, pressure);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeOberver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.tempterature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}