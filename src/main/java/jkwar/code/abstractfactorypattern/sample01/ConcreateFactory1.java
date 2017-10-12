package jkwar.code.abstractfactorypattern.sample01;

public class ConcreateFactory1 extends AbstractFactory {
  public AbstractProductA createProductA() {
    return new ConcreateProductA1();
  }

  public AbstractProductB createProductB() {
    return new ConcreateProductB1();
  }
}
