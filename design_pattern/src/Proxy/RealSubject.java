package Proxy;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午2:49
 * File Description：真实主题
 */
public class RealSubject implements Subject{
    public void request(){
        System.out.println("访问真实主题");
    }
}
