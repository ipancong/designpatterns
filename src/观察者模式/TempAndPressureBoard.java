package 观察者模式;

public class TempAndPressureBoard implements Observer,DisplayElement{

    private Double pa;
    private Double temp;
    private Subject weatherData;
    public TempAndPressureBoard(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("气压温度布告栏------》今天气压"+pa+"Pa，温度"+temp+"摄氏度");
    }

    @Override
    public void update(String todayWeather, Double pa, Double temp, String tomorrowWeather) {
        this.pa = pa;
        this.temp = temp;
        display();
    }
}
