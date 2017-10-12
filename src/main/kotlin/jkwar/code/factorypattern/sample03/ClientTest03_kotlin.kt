package jkwar.code.factorypattern.sample03

class ClientTest03_kotlin {
}

fun main(args: Array<String>) {
  val factory:TVFactory_kotlin=getBean("jkwar.code.factorypattern.sample03.") as TVFactory_kotlin;
  val tv:TV=factory.produceTV();
  tv.play();
}