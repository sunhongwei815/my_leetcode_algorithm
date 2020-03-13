package Prototype;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午11:46
 * File Description：具体原型类
 */
public class Realizetype implements Cloneable{
    Realizetype(){
        System.out.println("具体原型创建成功");
    }
    public Object clone() throws CloneNotSupportedException{
        System.out.println("具体原型复制成功");
        return (Realizetype)super.clone();
    }
}
