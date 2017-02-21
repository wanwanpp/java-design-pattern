package com.wp.观察者模式;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
    
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 78, 40.4f);
    }
}