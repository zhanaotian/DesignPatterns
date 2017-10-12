package jkwar.code.factorypattern.sample03


class HaierTVFactory_kotlin:TVFactory_kotlin {
  override fun produceTV(): TV {
    return HaierTV_kotlin();
  }
}