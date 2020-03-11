package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午5:42
 * File Description：抽象目标
 */
abstract class Subject {
    protected List<Observer> observers=new ArrayList<Observer>();

    //增加观察者
    public void add(Observer observer){
        observers.add(observer);
    }

    //删除观察者
    public void delete(Observer observer){
        observers.remove(observer);
    }

    //通知观察者
    public abstract void notifyObserver();

}
