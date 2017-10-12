package com.jkwar.kotlin.strategy

import java.io.ObjectStreamException

/**
 * 静态内部类单例模式
 * 第一次加载Singleton类时并不会初始化sInstance,只有在第一次调用Singleton的getInstance方法才会导致sInstance被初始化
 * 能保证线程安全,也能保证单例对象的唯一性,同时也延迟了单例的实例化.
 */
class StaticInnerClassesSingleton_kotlin {
    companion object {
        fun getInstance() = SingletonHolder.sInstance
        //杜绝反序化
        @Throws(ObjectStreamException::class)
        private fun readResolve(): Any {
            return SingletonHolder.sInstance
        }
    }

    /**
     * 静态内部类
     */
    private object SingletonHolder {
        val sInstance = StaticInnerClassesSingleton_kotlin()
    }


}
