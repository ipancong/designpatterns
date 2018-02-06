package 观察者模式;

public interface Observer {
    // 这个方法中的数据，原则上来说应该封装成一个对象，这里为了简单起见直接写死了
    public void update(String todayWeather,Double pa, Double temp, String tomorrowWeather);
}
