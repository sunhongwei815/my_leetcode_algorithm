package Observer.ObserverDemo;

import java.util.Observer;
import java.util.Observable;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午7:27
 * File Description：Observer测试类
 */
public class Tests {
    public static void main(String[] args) {
        OilFuture oilFuture=new OilFuture();
        Observer bull=new Bull(); //多方
        Observer bear=new Bear(); //空方

        oilFuture.addObserver(bull);
        oilFuture.addObserver(bear);
        oilFuture.setPrice(10);
        oilFuture.setPrice(-3);

    }
}
