package jkwar.code.observer.weather;

//压强表
public class ForecastDisplay implements Observer,DisplayElement{
  private float currentPressure= 29.92f;
  private float lastPressure;
  private Subject weatherData;

  public ForecastDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override public void display() {
    System.out.println("天气预测:");
    if (currentPressure>lastPressure) {
      System.out.println("天气炎热");
    }else if (currentPressure<lastPressure){
      System.out.println("天气凉爽");
    }else{
      System.out.println("天气没有变化");
    }
  }

  @Override public void update(float temp, float humidity, float pressure) {
    //赋值
    lastPressure = currentPressure;
    currentPressure = pressure;
    display();
  }
}
