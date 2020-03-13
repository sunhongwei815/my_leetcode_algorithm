package AbstractFactory;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午11:28
 * File Description：具体工厂：实现了产品的生成方法。
 */
public class ConcreteFactoryA implements AbstractFactory{
    public concreteProductA newProductA(){
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new concreteProductA();
    }

    public concreteProductB newProductB(){
        System.out.println("具体工厂 2 生成-->具体产品 22...");
        return new concreteProductB();
    }
}
