
package jkwar.code.strategy.sample01;

/**
 * Uber 打车策略
 */
public class UberStrategy implements CalculateStrategy {

    @Override
    public int calculatePrice(int miles) {
        if (miles < 10) {
            return (int) (2.5 * miles);
        } else if (miles > 20) {
            return (int) (miles * 1.2);
        } else {
            return (int) (1.1 * miles);
        }

    }

}
