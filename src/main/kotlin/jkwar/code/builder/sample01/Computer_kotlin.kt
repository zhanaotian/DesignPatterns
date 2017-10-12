package jkwar.code.builder.sample01


abstract class Computer_kotlin {
    protected var mBoard: String? = null
    protected var mDisplay: String? = null
    protected var mOS: String? = null

    // 设置 CPU 核心数
    fun setBoard(board: String) {
        mBoard = board
    }

    // 设置内存
    fun setDisplay(display: String) {
        mDisplay = display
    }

    // 设置操作系统
    abstract fun setOS()

    override fun toString(): String {
        return "Computer [mBoard=$mBoard, mDisplay=$mDisplay, mOS=$mOS]"
    }
}