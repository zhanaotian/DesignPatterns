package jkwar.code.builder.sample02

import jkwar.code.builder.sample01.Computer_kotlin
import jkwar.code.builder.sample01.Computer_kotlin01
import jkwar.code.builder.sample01.MacbookBuilder_kotlin
import jkwar.code.builder.sample01.MicrosoftBuilder_kotlin


class BuilderTest_kotlin01 {

}

fun main(args: Array<String>) {
    //使用kotlin的  apply 扩展
    Computer_kotlin01().apply {
        mBoard="英特尔主板i7"
        mDisplay="16G"
        mOS="win10"
    }.let { print(it) }

}