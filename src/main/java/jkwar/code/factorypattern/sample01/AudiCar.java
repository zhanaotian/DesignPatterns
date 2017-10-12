package jkwar.code.factorypattern.sample01;

public abstract class AudiCar {
  /**
   * 汽车的抽象产品类
   * 定义汽车的一个行为方法，车可以启动开走
   */
  public abstract void drive();

  /**
   * 汽车的抽象产品类
   * 定义汽车的一个行为方法，车可以自动导航
   */
  public abstract void selfNavigtion();


  /**
   * 汽车的抽象产品类
   * 定义汽车的一个行为方法，车可以喇叭
   */
  public abstract void horn();


}
