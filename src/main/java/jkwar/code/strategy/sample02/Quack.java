package jkwar.code.strategy.sample02;


public class Quack implements QuackBehavior{
  @Override public void quack() {
    System.out.println("Quack");
  }
}
