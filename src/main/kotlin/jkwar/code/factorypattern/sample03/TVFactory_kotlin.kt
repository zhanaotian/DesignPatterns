package jkwar.code.factorypattern.sample03


interface TVFactory_kotlin {
  /**
   * 抽象工厂类
   * @return 具体的Tv类
   */
  abstract fun produceTV(): TV
}