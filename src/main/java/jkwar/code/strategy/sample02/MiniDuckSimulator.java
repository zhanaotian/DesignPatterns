package jkwar.code.strategy.sample02;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();
    RubberDuck rubberDuck = new RubberDuck();
    DecoyDuck decoyDuck = new DecoyDuck();

    mallardDuck.performFly();
    rubberDuck.performFly();
    decoyDuck.performFly();
  }
}
