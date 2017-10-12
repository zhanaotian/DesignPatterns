package jkwar.code.abstractfactorypattern.sample01;

import jkwar.code.abstractfactorypattern.sample01.AbstractProductA;
import jkwar.code.abstractfactorypattern.sample01.AbstractProductB;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
  /**
   * 创建产品A的方法
   *
   * @return 产品A对象
   */
  public abstract AbstractProductA createProductA();

  /**
   * 创建产品B的方法
   *
   * @return 产品B对象
   */
  public abstract AbstractProductB createProductB();
}
