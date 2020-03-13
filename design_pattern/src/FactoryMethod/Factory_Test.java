package FactoryMethod;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午10:09
 * File Description：工厂方法测试类
 */
public class Factory_Test {
    public static void main(String[] args) {
        try {
            AbstractFactory fa=new concreteFactoryA();
            Product pa=fa.newProduct();
            pa.show();

            AbstractFactory fb=new concreteFactoryB();
            Product pb=fb.newProduct();
            pb.show();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
