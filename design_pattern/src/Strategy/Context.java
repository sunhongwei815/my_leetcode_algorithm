package Strategy;

/**
 * @author:Sun Hongwei
 * @2020/3/15 下午3:26
 * File Description：环境类
 */
public class Context {
    private Strategy strategy;
    public Strategy getStrategy(){
        return strategy;
    }
    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }
    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
