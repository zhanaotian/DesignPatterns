package jkwar.code.factorypattern.sample01


class ClientTest01_kotlin {
}

fun main(args: Array<String>) {
  //构造一个制造汽车的工厂对象
  var factory = AudiCarFactory_kotlin();

  //生产Q3并启动
  val audiQ3 = factory.createAudiCar(AudiQ3_kotlin::class.java);
  audiQ3!!.drive()
  audiQ3.selfNavigtion()
  audiQ3.horn()

  //生产Q5并启动
  val audiQ5 = factory.createAudiCar(AudiQ5_kotlin::class.java);
  audiQ5!!.drive()
  audiQ5.selfNavigtion()
  audiQ5.horn()

  //生产Q7并启动
  val audiQ7 = factory.createAudiCar(AudiQ7_kotlin::class.java);
  audiQ7!!.drive()
  audiQ7.selfNavigtion()
  audiQ7.horn()
}