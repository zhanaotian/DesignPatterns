package jkwar.code.abstractfactorypattern.sample02;

/**
 * 抽象工厂类
 */
public abstract class CarFactory {
  /**
   * 生产轮胎
   *
   * @return 轮胎
   */
   public abstract ITire createTire();

  /**
   * 生产发动机
   *
   * @return 发动机
   */
  public abstract IEngine createEngine();


  /**
   * 生产制动系统
   *
   * @return 制动系统
   */
  public abstract IBrake createBrake();
}
