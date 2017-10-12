package com.jkwar.kotlin.strategy

// 地铁价格计算策略
class SubwayStrategy_kotlin : CalculateStrategy_kotlin {
    /**
     * 6公里(含)内3元；6-12公里(含)4元；12-22公里(含)5元；22-32公里(含)6元；
     *
     * @param miles 公里
     * @return
     */
    override fun calculatePrice(miles: Int): Int {
        if (miles <= 6)
            return 3
        else if (miles > 6 && miles < 12)
            return 4
        else if (miles > 12 && miles < 22)
            return 5
        else if (miles > 22 && miles < 32)
            return 6
        else
        // 其他距离我们简化为7块
            return 7
    }
}