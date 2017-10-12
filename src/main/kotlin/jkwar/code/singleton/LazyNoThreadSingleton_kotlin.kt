package com.jkwar.kotlin.singleton

import java.io.ObjectStreamException


/**
 * 懒汉式单例模式
 * 优点:在声明静态对象,并且在用户第一项调用getInstance时进行初始化
 * 缺点:第一次加载时需要及时进行实例化,反应稍慢，在多线程调用时会创建不同实例，不安全
 */
//构造函数私有
class LazyNoThreadSingleton_kotlin {
    companion object {
        //采用原汁原味的Kotlin方法写
        val instance2 by lazy(LazyThreadSafetyMode.NONE) {
            com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin()
        }


        //采用java方式编写
        private var instance: com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin? = null

        //共有的静态函数 对外暴露获取单例对象的接口
        //synchronized 线程同步
        fun get(): com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin {
            if (com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin.Companion.instance == null) {
                com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin.Companion.instance = com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin()
            }
            return com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin.Companion.instance!!
        }

        //杜绝反序化
        @Throws(java.io.ObjectStreamException::class)
        private fun readResolve(): Any {
            return com.jkwar.kotlin.singleton.LazyNoThreadSingleton_kotlin.Companion.instance!!
        }
    }
}
