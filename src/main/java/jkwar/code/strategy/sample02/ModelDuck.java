package jkwar.code.strategy.sample02;


public class ModelDuck extends Duck{

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override void display() {
    System.out.println("I'm a modelduck");
  }
}
