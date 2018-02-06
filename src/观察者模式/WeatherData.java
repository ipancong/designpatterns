package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private String todayWeather;
    private Double pa;
    private Double temp;
    private String tomorrowWeather;
    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        // 注册新的观察者
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index > -1)
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        //数据改动时通知各个观察者
        for( Observer o : observers)
            o.update(todayWeather,pa,temp,tomorrowWeather);
    }

    public void dataChanged(){
        notifyObservers();
    }
    public void setNewData(String todayWeather,Double pa, Double temp, String tomorrowWeather){
        this.todayWeather = todayWeather;
        this.pa = pa;
        this.temp = temp;
        this.todayWeather = tomorrowWeather;
        dataChanged();
    }

}
