package jkwar.code.builder.sample01

import jkwar.code.builder.Computer
import jkwar.code.builder.Microsoft

//具体的 MicrosoftBuilder 类
class MicrosoftBuilder_kotlin : Builder_kotlin() {
    private val mComputer= Microsoft()

    override fun buildBoard(board: String): Builder_kotlin {
        mComputer.setBoard(board)
        return this
    }

    override fun buildDisplay(display: String): Builder_kotlin {
        mComputer.setDisplay(display)
        return this
    }

    override fun buildOS(): Builder_kotlin {
        mComputer.setOS()
        return this
    }

    override fun create(): Computer {
        return mComputer
    }
}