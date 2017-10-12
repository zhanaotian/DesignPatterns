package jkwar.code.factorypattern.sample02;

public abstract class Factory {
  /**
   * 抽象工厂方法
   * 具体生产什么由子类去实现
   *
   * @return 具体的产品对象
   */
  public abstract Product createProduct();

  /**
   * 抽象工厂方法
   * 具体生产什么由子类去实现
   *
   *
   */
  public abstract <T extends Product> T createProduct(Class<T> clz);
}
