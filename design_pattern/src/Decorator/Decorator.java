package Decorator;

/**
 * @author:Sun Hongwei
 * @2020/3/14 上午12:00
 * File Description：抽象装饰角色
 */
public class Decorator implements Component{
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }

    public void operation(){
        component.operation();
    }
}
