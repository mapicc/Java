package designPattern.strategyPattern;

/**
 * Created by zhaoguanjun on 2016/8/30.
 */
public class StrategyContext {
    Strategy strategy = null;
    public StrategyContext(String type) {
        switch (type) {
            case "A" : strategy = new StrategyA();break;
            case "B" : strategy = new StrategyB();break;
            default: break;
        }
    }

    public void StrategyContextMethod() {
        strategy.commonStrategy();
    }
}
