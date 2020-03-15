package Strategy;

/**
 * @author:Sun Hongwei
 * @2020/3/15 下午3:37
 * File Description：
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context=new Context();
        Strategy strategyA=new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.strategyMethod();
        System.out.println("-------------------");

        Strategy strategyB=new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();
    }

}
