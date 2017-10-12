package jkwar.code.abstractfactorypattern.sample01;

public class ConcreateFactory2 extends AbstractFactory {
  public AbstractProductA createProductA() {
    return new ConcreateProductA2();
  }

  public AbstractProductB createProductB() {
    return new ConcreateProductB2();
  }
}
