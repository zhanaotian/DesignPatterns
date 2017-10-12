package jkwar.code.abstractfactorypattern.sample03;

//具体产品类 HairAirConditioner
public class HairAirConditioner implements AirConditioner{
  public void changeTemperature() {
    System.out.println("海尔空调调节温度中。。。。。。");
  }
}
