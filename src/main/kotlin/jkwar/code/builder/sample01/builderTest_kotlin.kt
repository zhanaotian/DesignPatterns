package jkwar.code.builder.sample02

import jkwar.code.builder.sample01.MacbookBuilder_kotlin
import jkwar.code.builder.sample01.MicrosoftBuilder_kotlin


class BuilderTest_kotlin {

}

fun main(args: Array<String>) {
    // 封装构建过程, 4 核, 内存 16GB, Mac 系统
    val builder = MacbookBuilder_kotlin()
            .buildBoard("英特尔主板i7")
            .buildDisplay("16G")
            .buildOS()
    println(builder.create().toString())
    val builder1= MicrosoftBuilder_kotlin().buildBoard("英特尔主板i7")
            .buildDisplay("20G")
            .buildOS()
    println(builder1.create().toString())
}