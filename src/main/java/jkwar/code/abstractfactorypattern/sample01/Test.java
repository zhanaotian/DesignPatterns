package jkwar.code.abstractfactorypattern.sample01;

public class Test {
  public static void main(String[] args) {
    AbstractFactory factory = new ConcreateFactory1();
    AbstractProductA productA = factory.createProductA();
    productA.method();
    AbstractProductB productB = factory.createProductB();
    productB.method();

    AbstractFactory factory1 = new ConcreateFactory2();
    factory1.createProductA();
    factory1.createProductB();
  }
}
