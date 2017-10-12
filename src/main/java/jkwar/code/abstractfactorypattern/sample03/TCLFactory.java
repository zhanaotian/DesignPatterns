package jkwar.code.abstractfactorypattern.sample03;


public class TCLFactory implements EFactory{
  public Television produceTelevision() {
    return new TCLTelevision();
  }

  public AirConditioner produceAirConditioner() {
    return new TCLAirConditioner();
  }
}
