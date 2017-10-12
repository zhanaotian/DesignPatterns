package com.jkwar.kotlin.strategy

/**
 * 出租车计算策略
 */
class TaxiStrategy_kotlin : CalculateStrategy_kotlin {
    // 价格我们简单计算为 公里数 * 2
    override fun calculatePrice(miles: Int): Int = miles * 2
}