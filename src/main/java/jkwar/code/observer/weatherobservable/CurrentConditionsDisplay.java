package jkwar.code.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;
import jkwar.code.observer.weather.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable observable) {
    observable.addObserver(this);
  }

  @Override public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData= (WeatherData) o;
      this.temperature=weatherData.getTemperature();
      this.humidity=weatherData.getHumidity();
      display();
    }
  }

  @Override public void display() {
    System.out.println(" 温度: " + temperature
        + "湿度" + humidity);
  }
}
