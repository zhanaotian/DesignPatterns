package jkwar.code.abstractfactorypattern


class HaierFactory_kotlin :EFactory_kotlin{
  override fun produceTelevision(): Television_kotlin {
    return HaierTelevision_kotlin()
  }

  override fun produceAirConditioner(): AirConditioner_kotlin {
    return HaierAirConditioner_kotlin();
  }
}