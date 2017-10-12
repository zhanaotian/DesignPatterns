
package jkwar.code.strategy.sample01;

// 公交出行价格计算器
public class TranficCalculatorTest {

    public static void main(String[] args) {
        TranficCalculatorTest calculator = new TranficCalculatorTest();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车乘16公里的价格 : " + calculator.calculatePrice(16));
        calculator.setStrategy(new TaxiStrategy());
        System.out.println("出租车乘16公里的价格 : " + calculator.calculatePrice(16));
    }

    CalculateStrategy mStrategy;
    //依赖倒置
    public void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }


    public int calculatePrice(int km) {
        //委托
        return mStrategy.calculatePrice(km);
    }
}
