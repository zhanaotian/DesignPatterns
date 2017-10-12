package jkwar.code.strategy.sample01;

/**
 * 公交车价格计算策略
 */
public class BusStrategy implements CalculateStrategy {

    /**
     * 北京公交车,10里之内1块钱,超过十公里之后每加一块钱可以乘5公里
     *
     * @param miles 公里
     * @return
     */
    public int calculatePrice(int miles) {
        // 超过10公里的总距离
        int extraTotal = miles - 10;
        // 超过的距离是5公里的倍数
        int extraFactor = extraTotal / 5;
        // 超过的距离对5公里的取余
        int fraction = extraTotal % 5;
        // 价格计算
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
