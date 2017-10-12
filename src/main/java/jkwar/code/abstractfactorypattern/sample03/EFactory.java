package jkwar.code.abstractfactorypattern.sample03;

//抽象工厂类
public interface EFactory {
  /**
   * 抽象方法
   */
  public Television produceTelevision();

  public AirConditioner produceAirConditioner();
}
