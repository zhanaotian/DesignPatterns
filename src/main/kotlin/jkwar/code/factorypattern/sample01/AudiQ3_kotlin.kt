package jkwar.code.factorypattern.sample01


class AudiQ3_kotlin : AudiCar_kotlin() {
  override fun drive() {
    println("Q3 启动!")
  }

  override fun selfNavigtion() {
    println("Q3 自动导航!")
  }

  override fun horn() {
    println("Q3 吹喇叭!")
  }
}