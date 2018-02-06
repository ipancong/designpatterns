package 观察者模式.JDK;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TempAndPressureBoard tempAndPressureBoard = new TempAndPressureBoard(weatherData);
        weatherData.setNewData("晴朗",5.0,25.0,"晴朗");
        weatherData.setNewData("下雨",4.0,22.0,"下雪");
    }
}
