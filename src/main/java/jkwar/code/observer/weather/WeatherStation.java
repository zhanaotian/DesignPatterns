package jkwar.code.observer.weather;


public class WeatherStation {
  public static void main(String[] args) {
    //实例化主题
    WeatherData weatherData=new WeatherData();
    //具体观察者
    CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

    weatherData.setMeasurements(80,65,35.f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(50,25,15.f);

  }
}
