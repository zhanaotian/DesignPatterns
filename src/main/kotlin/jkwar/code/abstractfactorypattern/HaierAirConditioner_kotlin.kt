package jkwar.code.abstractfactorypattern

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

//具体产品类
class HaierAirConditioner_kotlin:AirConditioner_kotlin {
  override fun changeTemperature() {
    println("海尔空调调节温度。。。。。。。。")
  }
}