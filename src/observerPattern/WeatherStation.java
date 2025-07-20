package observerPattern;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-18
 * 풀이방법
 **/


public class WeatherStation {
    public static void main(String[] args) {

        WeatherSubject weatherSubject = new WeatherSubject();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherSubject);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherSubject);
    }
}
