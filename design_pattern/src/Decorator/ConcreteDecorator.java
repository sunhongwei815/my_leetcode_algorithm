package Decorator;

/**
 * @author:Sun Hongwei
 * @2020/3/14 上午12:03
 * File Description：具体装饰角色
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }

    public void operation(){
        super.operation();
        addFunction();
    }

    public void addFunction(){
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
