package jkwar.code.prototype

import java.util.*

fun main(args: Array<String>) {
  var mImages=Array<String>(5){"图片1";"图片2";"图片3";"图片4";"图片5"}
  val word = WordDkcument_kotlin("清华字典", mImages)
  word.showDocument()
  println("----拷贝的文档对象-------")
  val wordCopy=word.copy(mTest="修改过的doc2文本")
  println("----打印修改基本类型的文档对象-------")
  wordCopy.showDocument()
  val wordCopy01=word.copy(mImages=Array<String>(3){"图片6";"图片7";"图片10"})
  println("----打印修改过引用类型的文档对象-------")
  wordCopy01.showDocument()
  word.showDocument()
}