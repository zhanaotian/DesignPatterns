package jkwar.code.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;

  public ForecastDisplay(Observable observable) {
    observable.addObserver(this);
  }

  @Override public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }

  @Override public void display() {
    System.out.println("天气预测:");
    if (currentPressure > lastPressure) {
      System.out.println("天气炎热");
    } else if (currentPressure < lastPressure) {
      System.out.println("天气凉爽");
    } else {
      System.out.println("天气没有变化");
    }
  }
}
