package FactoryMethod;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午10:07
 * File Description：具体工厂A：实现了产品A的生成方法
 */
public class concreteFactoryA implements AbstractFactory {
    public Product newProduct(){
        System.out.println("具体工厂A生成-->具体产品A...");
        return new concreteProductA();
    }
}
