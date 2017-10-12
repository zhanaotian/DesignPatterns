package jkwar.code.factorypattern.sample02


abstract class Factory_kotlin {
  /**
   * 抽象工厂方法
   * 具体生产什么由子类去实现

   * @return 具体的产品对象
   */
  abstract fun createProduct(): Product_kotlin

  /**
   * 抽象工厂方法
   * 具体生产什么由子类去实现
   */
  abstract fun <T : Product_kotlin> createProduct(clz: Class<T>): T?
}