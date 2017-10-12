package jkwar.code.builder.sample01

import jkwar.code.builder.Computer

//抽象 Builder 类
abstract class Builder_kotlin {
    // 设置主机
    abstract fun buildBoard(board: String): Builder_kotlin

    // 设置显示器
    abstract fun buildDisplay(display: String): Builder_kotlin

    // 设置操作系统
    abstract fun buildOS(): Builder_kotlin

    // 创建Computer
    abstract fun create(): Computer
}