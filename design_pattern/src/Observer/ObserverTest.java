package Observer;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午5:47
 * File Description：Observer测试类
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer obs1=new ConcreteObserver1();
        Observer obs2=new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
