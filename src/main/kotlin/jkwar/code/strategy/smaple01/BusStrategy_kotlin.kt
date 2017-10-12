package com.jkwar.kotlin.strategy


/**
 * Created by jkwar on 2017/6/1.
 * 公交车价格计算策略
 */
class BusStrategy_kotlin : CalculateStrategy_kotlin {
    override fun calculatePrice(miles: Int): Int {
        // 超过10公里的总距离
        var extraTotal = miles - 10;
        // 超过的距离是5公里的倍数
        var extraFactor = extraTotal / 5;
        // 超过的距离对5公里的取余
        var fraction = extraTotal % 5;
        // 价格计算
        var price = 1 + extraFactor * 1;
        //没有三元表达式
        if (fraction > 0)
            return ++price
          else
            return price
    }

}