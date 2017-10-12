package jkwar.code.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement{
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum= 0.0f;
  private int numReadings;

  public StatisticsDisplay(Observable observable) {
    observable.addObserver(this);
  }

  @Override public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData)o;
      float temp = weatherData.getTemperature();
      tempSum += temp;
      numReadings++;

      if (temp > maxTemp) {
        maxTemp = temp;
      }

      if (temp < minTemp) {
        minTemp = temp;
      }

      display();
    }
  }

  @Override public void display() {
    System.out.println("平均/最大/最小温度 = " + (tempSum / numReadings)
        + "/" + maxTemp + "/" + minTemp);
  }
}
