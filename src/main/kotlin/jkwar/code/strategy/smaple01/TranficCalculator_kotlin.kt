package com.jkwar.kotlin

import com.jkwar.kotlin.strategy.BusStrategy_kotlin
import com.jkwar.kotlin.strategy.CalculateStrategy_kotlin
import com.jkwar.kotlin.strategy.TaxiStrategy_kotlin


// 公交出行价格计算器
class TranficCalculator_kotlin{
    internal var mStrategy: CalculateStrategy_kotlin? = null;

    fun setStrategy(mStrategy: CalculateStrategy_kotlin) {
        this.mStrategy = mStrategy
    }

    fun calculatePrice(km: Int): Int {
        return mStrategy!!.calculatePrice(km)
    }
}


fun main(args: Array<String>) {
    val calculator = TranficCalculator_kotlin()
    calculator.setStrategy(BusStrategy_kotlin())
    println("公交车乘20公里的价格 : " + calculator.calculatePrice(20))
    calculator.setStrategy(TaxiStrategy_kotlin())
    println("出租车乘20公里的价格 : " + calculator.calculatePrice(20))
}