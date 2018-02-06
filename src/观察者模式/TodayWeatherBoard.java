package 观察者模式;

public class TodayWeatherBoard implements Observer,DisplayElement {
    private String todayWeather;
    private Subject weatherData;

    public TodayWeatherBoard(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("今天天气布告栏------》今天天气"+this.todayWeather);
    }

    @Override
    public void update(String todayWeather, Double pa, Double temp, String tomorrowWeather) {
        this.todayWeather = todayWeather;
        display();
    }
}
