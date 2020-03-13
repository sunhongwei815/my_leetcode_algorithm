package FactoryMethod;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午10:08
 * File Description：具体工厂B：实现了产品B的生成方法
 */
public class concreteFactoryB implements AbstractFactory {
    public Product newProduct(){
        System.out.println("具体工厂B生成-->具体产品B...");
        return new concreteProductB();
    }
}
