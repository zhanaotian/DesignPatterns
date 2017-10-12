package jkwar.code.abstractfactorypattern

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

//抽象产品类
class TCLAirConditioner_kotlin :AirConditioner_kotlin{
  override fun changeTemperature() {
    println("TCL空调调节温度。。。。。。。。")
  }
}