package com.observable;

import java.util.ArrayList;

import com.observer.IObserver;

public class WeatherData implements IObservable{

    private ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        this.observers = new ArrayList<IObserver>();
    }

    @Override
    public void add(IObserver iObserver) {
        observers.add(iObserver);
        
    }

    @Override
    public void remove(IObserver iObserver) {
        int i = observers.indexOf(iObserver);
        if(i >=0 ){
            observers.remove(i);
        }
        
    }

    @Override
    public void notifying() {
        for(IObserver o : this.observers){
            o.update();
        }
        
    }

    public void measurementChanged(){
        notifying();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }  
    
}
