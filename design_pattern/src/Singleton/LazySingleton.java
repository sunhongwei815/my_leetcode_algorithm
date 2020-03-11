package Singleton;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午2:02
 * File Description：懒汉式单例模式：类加载时不会生成单例，只有第一次getInstance时会创建这个单例
 */
public class LazySingleton {
    //保证instance在所有线程同步
    private static volatile LazySingleton instance=null;
    private LazySingleton(){}   //避免类在外部实例化

    public static synchronized LazySingleton getInstance() {
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

}
