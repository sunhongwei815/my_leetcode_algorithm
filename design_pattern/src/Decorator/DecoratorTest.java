package Decorator;

/**
 * @author:Sun Hongwei
 * @2020/3/14 上午12:23
 * File Description：装饰模式测试
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("----------");
        Component d=new ConcreteDecorator(p);
        d.operation();


    }
}
