package observerPattern;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-18
 * 풀이방법
 **/


public class ForecastDisplay implements Observer , DisPlay{

    private double temperature;
    private double  humidity;

    @Override
    public void display() {

    }


    @Override
    public void update(double temperature, double humidity, double pressure) {

    }
}
