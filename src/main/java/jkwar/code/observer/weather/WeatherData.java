package jkwar.code.observer.weather;

import java.util.ArrayList;

//具体主题类
public class WeatherData implements Subject {
  //观察者集合
  private ArrayList<Observer> observers;
  //温度
  private float temperature;
  //湿度
  private float humidity;
  //压强
  private float pressure;

  public WeatherData() {
    //实例化观察者集合
    observers = new ArrayList<Observer>();
  }

  @Override public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override public void removeObserver(Observer observer) {
    //查找观察者
    int i = observers.indexOf(observer);
    if (i > 0) {
      observers.remove(i);
    }
  }

  @Override public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  //天气测量
  public void measurementsChanged() {
    notifyObservers();
  }

  //设置测量数据并且更新
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
