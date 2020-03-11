package Singleton;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午2:13
 * File Description：饿汉式单例：类一旦加载的时候，就创建一个单例
 */
public class HungrySingleton {
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){};
    public static HungrySingleton getInstance(){
        return instance;
    }
}
