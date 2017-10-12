package jkwar.code.abstractfactorypattern

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

//具体产品类
class HaierTelevision_kotlin : Television_kotlin {
  override fun play() {
    println("海尔电视播放视频。。。。。。。")
  }
}