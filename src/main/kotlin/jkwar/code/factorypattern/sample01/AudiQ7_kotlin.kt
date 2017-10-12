package jkwar.code.factorypattern.sample01


class AudiQ7_kotlin : AudiCar_kotlin() {
  override fun drive() {
    println("Q7 启动!")
  }

  override fun selfNavigtion() {
    println("Q7 自动导航!")
  }

  override fun horn() {
    println("Q7 吹喇叭!")
  }
}