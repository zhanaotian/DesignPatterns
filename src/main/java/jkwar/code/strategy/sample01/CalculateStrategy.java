

package jkwar.code.strategy.sample01;

/**
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     * 
     * @param miles 公里
     * @return 返回价格
     */
    int calculatePrice(int miles);
}
