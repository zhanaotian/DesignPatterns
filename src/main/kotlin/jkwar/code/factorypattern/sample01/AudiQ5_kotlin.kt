package jkwar.code.factorypattern.sample01


class AudiQ5_kotlin : AudiCar_kotlin() {
  override fun drive() {
    println("Q5 启动!")
  }

  override fun selfNavigtion() {
    println("Q5 自动导航!")

  }

  override fun horn() {
    println("Q5 吹喇叭!")
  }
}