package 观察者模式.JDK;


import java.util.Observable;

public class WeatherData extends Observable {
    private String todayWeather;
    private Double pa;
    private Double temp;
    private String tomorrowWeather;


    public void setNewData(String todayWeather,Double pa, Double temp, String tomorrowWeather){
        this.todayWeather = todayWeather;
        this.pa = pa;
        this.temp = temp;
        this.todayWeather = tomorrowWeather;
        setChanged();
        notifyObservers();
    }


    public String getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(String todayWeather) {
        this.todayWeather = todayWeather;
    }

    public Double getPa() {
        return pa;
    }

    public void setPa(Double pa) {
        this.pa = pa;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getTomorrowWeather() {
        return tomorrowWeather;
    }

    public void setTomorrowWeather(String tomorrowWeather) {
        this.tomorrowWeather = tomorrowWeather;
    }
}
