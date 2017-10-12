package com.jkwar.kotlin.singleton

import javax.management.ObjectInstance
import java.util.HashMap

/**
 * 容器单例
 * 管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，降低用户的使用成本，降低耦合度
 */
class ContainerSingleton_kotlin {
    companion object {
        private val objectMap = java.util.HashMap<String, Any>()

        fun registerService(key: String, instance: javax.management.ObjectInstance) {
            if (com.jkwar.kotlin.singleton.ContainerSingleton_kotlin.Companion.objectMap.containsKey(key)) {
                com.jkwar.kotlin.singleton.ContainerSingleton_kotlin.Companion.objectMap.put(key, instance)
            }
        }

        fun getService(key: String): Any? {
            return com.jkwar.kotlin.singleton.ContainerSingleton_kotlin.Companion.objectMap[key]
        }
    }
}
