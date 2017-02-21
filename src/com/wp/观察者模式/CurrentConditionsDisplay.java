package com.wp.观察者模式;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);      //注册观察者
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }

}