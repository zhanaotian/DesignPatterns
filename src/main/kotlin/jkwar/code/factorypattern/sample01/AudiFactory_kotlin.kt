package jkwar.code.factorypattern.sample01


abstract class AudiFactory_kotlin {
  /**
   * 某车型的工厂方法
   *
   * @param clz 具体的SUV型号类型
   * *
   * *
   * @return 具体型号的SUV车对象
   */
  abstract fun <T : AudiCar_kotlin> createAudiCar(clz: Class<T>): T?
}