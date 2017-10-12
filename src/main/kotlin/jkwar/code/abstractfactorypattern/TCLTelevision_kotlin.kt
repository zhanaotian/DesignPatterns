package jkwar.code.abstractfactorypattern

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

//抽象产品类
class TCLTelevision_kotlin :Television_kotlin{
  override fun play() {
    println("TCL电视播放视频。。。。。。。")
  }
}