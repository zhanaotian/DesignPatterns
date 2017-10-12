package jkwar.code.strategy.sample02;

public class MiniDuckSimulator01 {

  public static void main(String[] args) {
     Duck mallard=new MallardDuck();
     mallard.performFly();
     mallard.performQuack();
     //里氏替换
     Duck model=new ModelDuck();
     model.performFly();
     //依赖倒置
     model.setFlyBehavior(new FlyRocketPowered());
     model.performFly();
  }
}
