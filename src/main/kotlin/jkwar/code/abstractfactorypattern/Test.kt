package jkwar.code.abstractfactorypattern


class Test {
}

fun main(args: Array<String>) {
  val factory=HaierFactory_kotlin()
  factory.produceTelevision().play()
  factory.produceAirConditioner().changeTemperature()

  val factory1=TCLFactory_kotlin()
  factory1.produceTelevision().play()
  factory1.produceAirConditioner().changeTemperature()
}