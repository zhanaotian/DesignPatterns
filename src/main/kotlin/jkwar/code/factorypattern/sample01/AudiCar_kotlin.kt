package jkwar.code.factorypattern.sample01

abstract class AudiCar_kotlin {
  /**
   * 汽车的抽象产品类
   * 定义汽车的一个行为方法，车可以启动开走
   */
  abstract fun drive()


  /**
   * 汽车的抽象产品类
   * 定义汽车的一个行为方法，车可以自动导航
   */
  abstract fun selfNavigtion()


  /**
   * 汽车的抽象产品类
   * 定义汽车的一个行为方法，车可以喇叭
   */
  abstract fun horn()
}