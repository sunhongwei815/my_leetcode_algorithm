package Observer;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午6:00
 * File Description：具体目标
 */
public class ConcreteSubject extends Subject{

    @Override
    public void notifyObserver(){
        System.out.println("具体的目标——————————————");
        for(Object obs:observers){
            ((Observer)obs).response();
        }

    }


}
