package com.jkwar.kotlin.strategy

/**
 * 计算机接口
 */
interface CalculateStrategy_kotlin {
    /**
     * 按距离来计算价格

     * @param miles 公里
     * *
     * @return 返回价格
     */
    abstract fun calculatePrice(miles: Int): Int
}