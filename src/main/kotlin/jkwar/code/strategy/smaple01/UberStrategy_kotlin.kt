package com.jkwar.kotlin.strategy

/**
 *  ubar 计费策略
 */
class UberStrategy_kotlin : CalculateStrategy_kotlin {
    override fun calculatePrice(miles: Int): Int {
        if (miles < 10) {
            return (2.5 * miles).toInt()
        } else if (miles > 20) {
            return (miles * 1.2).toInt()
        } else {
            return (1.1 * miles).toInt()
        }
    }
}