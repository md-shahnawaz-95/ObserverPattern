package com.observerPattern;

import com.observable.WeatherData;
import com.observer.PhoneDisplay;

public class WeatherStation {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherData);

        weatherData.add(phoneDisplay);//you can add this code in the constructor of observer so that
                                      //whenever any new obeserver is created the observer is 
                                      //registerd in the observable
        weatherData.setMeasurements(25.3f, 89.4f, 1);
    }
}
