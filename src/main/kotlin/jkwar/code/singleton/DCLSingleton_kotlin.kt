package com.jkwar.kotlin.singleton

import java.io.ObjectStreamException

/**
 * DCL(Double CheckLock)单例
 * 优点:既能在需要时才初始化单例,又能保证线程安全,单例对象初始化后调用getInstance不进行同步锁,资源利用率高.
 * 缺点:第一次加载时反应稍慢,也由于java内存模型的原因偶尔会失败,在高并发环境下,有一定缺陷,虽然发生概率很小,
 * 由于java编译器允许处理器乱序执行,以及JDK1.5之前JMM中Cache,寄存器,到主内存会写顺序的规定,执行顺序无法保证,可能是1-2-3也可能是1-3-2,就会
 * 出现DCL失效问题,并且这种难以根治难以重新的错误很可能会隐藏很久,在jdk1.5之后官方调整了JMM,具体化volatile关键字,保证了执行顺序.
 */
class DCLSingleton_kotlin {

    companion object {
        //用原汁原味的kotlin方法写
        val instance2  by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED){
            DCLSingleton_kotlin()
        }

        //用java的方式写
        private @Volatile var instance: DCLSingleton_kotlin? = null

        fun get(): DCLSingleton_kotlin {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = DCLSingleton_kotlin()
                    }
                }
            }
            return instance!!
        }


        //杜绝反序化
        @Throws(ObjectStreamException::class)
        private fun readResolve(): Any {
            return instance!!
        }

    }

}
