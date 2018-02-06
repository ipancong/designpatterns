package 观察者模式.JDK;

import 观察者模式.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class TempAndPressureBoard implements Observer, DisplayElement{
    private Double pa;
    private Double temp;
    public TempAndPressureBoard(Observable observable){
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
       if( o instanceof  WeatherData){
           this.pa = ((WeatherData) o).getPa();
           this.temp = ((WeatherData) o).getTemp();
           display();
       }
    }

    @Override
    public void display() {
        System.out.println("气压温度布告栏------》今天气压"+pa+"Pa，温度"+temp+"摄氏度");
    }
}
