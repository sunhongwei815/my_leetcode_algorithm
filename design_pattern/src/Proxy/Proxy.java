package Proxy;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午3:04
 * File Description：代理
 */
public class Proxy implements Subject{
    private RealSubject realSubject;

    public void request(){
        if (realSubject == null) {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问前处理----");
    }
    public void postRequest(){
        System.out.println("访问后处理----");
    }
}
