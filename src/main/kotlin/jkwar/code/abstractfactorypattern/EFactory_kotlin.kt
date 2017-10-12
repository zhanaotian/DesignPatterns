package jkwar.code.abstractfactorypattern

import jkwar.code.abstractfactorypattern.sample03.Television

//抽象工厂类
interface EFactory_kotlin {
  fun produceTelevision(): Television_kotlin
  fun produceAirConditioner():AirConditioner_kotlin
}