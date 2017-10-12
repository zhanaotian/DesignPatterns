package jkwar.code.factorypattern.sample03

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println


class HaierTV_kotlin :TV_kotlin, TV {
  override fun play() {
    println("海尔电视播放视频")
  }
}