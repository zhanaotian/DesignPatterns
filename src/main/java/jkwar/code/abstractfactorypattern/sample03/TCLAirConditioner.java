package jkwar.code.abstractfactorypattern.sample03;

//具体产品类 TCLAirConditioner
public class TCLAirConditioner implements AirConditioner{
  public void changeTemperature() {
    System.out.printf("TCL空间调节温度中。。。。");
  }
}
