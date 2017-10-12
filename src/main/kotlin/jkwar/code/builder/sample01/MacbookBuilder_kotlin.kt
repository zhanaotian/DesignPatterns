package jkwar.code.builder.sample01

import jkwar.code.builder.Computer
import jkwar.code.builder.Macbook

//具体的builder实现类
class MacbookBuilder_kotlin : Builder_kotlin() {
    private val mComputer = Macbook()

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