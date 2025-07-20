package observerPattern;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-18
 * 풀이방법
 **/


@Getter
public class WeatherSubject implements Subject{
    private  List<Observer> observers;
    private double Temperature;
    private double Pressure;
    private double Humidity;

    public WeatherSubject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(Temperature, Pressure, Humidity);
        }
    }

    void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double pressure, double humidity) {
        Temperature = temperature;
        Pressure = pressure;
        Humidity = humidity;
        measurementsChanged();
    }
}
