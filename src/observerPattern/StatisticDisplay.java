package observerPattern;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-18
 * 풀이방법
 **/


public class StatisticDisplay implements Observer , DisPlay{

    private double maxTemp = 0.0f;
    private double minTemp = 200; // 초기값을 충분히 높게 설정
    private double tempSum = 0.0f;
    private int count = 0; // 측정 횟수
    private WeatherSubject weatherSubject;

    public StatisticDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void display() {
        // 평균, 최대, 최소값 출력
        System.out.println("Avg/Max/Min temperature = " + (tempSum / count)
                + "/" + maxTemp + "/" + minTemp);
    }


    @Override
    public void update(double temperature, double humidity, double pressure) {
        tempSum += temperature; // 온도를 계속 더함
        count++;   // 측정 횟수 증가

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }
        display();
    }
}
