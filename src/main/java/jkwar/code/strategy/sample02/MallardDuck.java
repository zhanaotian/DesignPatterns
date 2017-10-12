package jkwar.code.strategy.sample02;

public class MallardDuck extends Duck {
  public MallardDuck() {
    //里氏替换
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
