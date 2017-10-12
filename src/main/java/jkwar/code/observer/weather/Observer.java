package jkwar.code.observer.weather;

//抽象观察者
public interface Observer {
  //更新湿度 温度 压强
  public void update(float temp, float humidity, float pressure);
}

