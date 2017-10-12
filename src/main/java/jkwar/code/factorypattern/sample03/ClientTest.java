package jkwar.code.factorypattern.sample03;

import jkwar.code.abstractfactorypattern.sample03.XMLUtil;

public class ClientTest {
  public static void main(String args[]) {
    try {
      TV tv;
      TVFactory_kotlin factory;
      factory = (TVFactory_kotlin) XMLUtil.getBean("jkwar.code.factorypattern.sample03.");
      tv = factory.produceTV();
      tv.play();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
