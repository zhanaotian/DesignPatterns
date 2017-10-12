package jkwar.code.factorypattern.sample01


@Suppress("UNCHECKED_CAST")
class AudiCarFactory_kotlin : AudiFactory_kotlin() {
  override fun <T : AudiCar_kotlin> createAudiCar(clz: Class<T>): T? {
    var car: AudiCar_kotlin? = null
    try {
      car = Class.forName(clz.name).newInstance() as AudiCar_kotlin
    } catch (e: Exception) {
      e.cause
    }
    return car as T?
  }

}