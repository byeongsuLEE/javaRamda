package observerPattern;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-18
 * 풀이방법
 **/


public class CurrentConditionDisplay implements Observer , DisPlay{

    private double temperature;
    private double humidity;
    private WeatherSubject weatherSubject;
    public CurrentConditionDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }
    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current temperature : ").append(temperature);
        sb.append("\nCurrent humidity : ").append(humidity);
        System.out.println(sb.toString());
    }
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
