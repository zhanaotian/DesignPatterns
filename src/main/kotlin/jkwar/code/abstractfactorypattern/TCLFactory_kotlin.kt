package jkwar.code.abstractfactorypattern


class TCLFactory_kotlin :EFactory_kotlin {
  override fun produceAirConditioner(): AirConditioner_kotlin {
    return TCLAirConditioner_kotlin();
   }

  override fun produceTelevision(): Television_kotlin {
   return  TCLTelevision_kotlin();
  }


}