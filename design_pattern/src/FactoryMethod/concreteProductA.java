package FactoryMethod;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午10:01
 * File Description：具体产品A：实现抽象产品中的抽象方法
 */
public class concreteProductA implements Product {
    public void show(){
        System.out.println("具体产品A:-______-");
    }
}
