package jkwar.code.abstractfactorypattern.sample03;

//海尔工厂类
public class HaierFactory implements EFactory{
  public Television produceTelevision() {
    return new HaierTelevision();
  }

  public AirConditioner produceAirConditioner() {
    return new HairAirConditioner();
  }
}
