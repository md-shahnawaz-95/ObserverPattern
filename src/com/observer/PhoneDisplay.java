package com.observer;

import com.observable.WeatherData;

public class PhoneDisplay implements IObserver {

    private WeatherData weatherData;

    public PhoneDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        System.out.println("Current conditions: " + this.weatherData.getTemperature() 
                            + "C degrees || " + this.weatherData.getHumidity() + "% humidity");
        
    }
 
}
