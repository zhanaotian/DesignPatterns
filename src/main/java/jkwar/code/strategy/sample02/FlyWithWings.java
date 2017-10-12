package jkwar.code.strategy.sample02;

//FlyBehavior具体实现类
public class FlyWithWings implements FlyBehavior{
  @Override public void fly() {
    System.out.println("FlyWithWings");
  }
}
