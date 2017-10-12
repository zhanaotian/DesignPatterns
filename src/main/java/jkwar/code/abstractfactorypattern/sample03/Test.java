package jkwar.code.abstractfactorypattern.sample03;

public class Test {
  public static void main(String[] args) {
    try {
      EFactory factory = (EFactory) XMLUtil.getBean("jkwar.code.abstractfactorypattern.sample03.");
      Television television = factory.produceTelevision();
      AirConditioner airConditioner = factory.produceAirConditioner();
      television.play();
      airConditioner.changeTemperature();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
