package Observer.ObserverDemo;

import java.util.Observer;
import java.util.Observable;


/**
 * @author:Sun Hongwei
 * @2020/3/13 下午7:23
 * File Description：具体观察者：多方
 */
public class Bull implements Observer {
    public void update(Observable o, Object arg){
        Float price=((Float)arg).floatValue();
        if(price>0){
            System.out.println("多方发现： oil上涨"+price+"元! ");
        }else{
            System.out.println("多方发现： oil下跌"+(-price)+"元! ");
        }
    }

    public void response(){
        System.out.println("response");
    }
}
