package AbstractFactory;

import FactoryMethod.Product;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午11:26
 * File Description：抽象工厂：提供了产品的生成方法。
 */
public interface AbstractFactory {
    public concreteProductA newProductA();
    public concreteProductB newProductB();
}
