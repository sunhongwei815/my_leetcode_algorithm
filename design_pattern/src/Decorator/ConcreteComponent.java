package Decorator;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午11:58
 * File Description：具体构件角色
 */
public class ConcreteComponent implements Component{
    public ConcreteComponent(){
        System.out.println("创建具体构件角色");
    }

    public void operation(){
        System.out.println("调用具体构件角色的方法operation()");
    }
}
