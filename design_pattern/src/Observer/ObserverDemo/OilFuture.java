package Observer.ObserverDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 * @author:Sun Hongwei
 * @2020/3/13 下午7:17
 * File Description：具体目标：OilFuture原油期货
 */
public class OilFuture extends Observable {
    private float price;
    public float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
        super.setChanged(); //设置内部标志位，注明数据发生变化
        super.notifyObservers(price); //通知观察者价格改变了
        this.price=price;
    }

    protected List<Observer> observers=new ArrayList<Observer>();
    //增加观察者
    public void add(Observer observer){
        observers.add(observer);
    }

}
