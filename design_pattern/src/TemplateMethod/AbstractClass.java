package TemplateMethod;

/**
 * @author:Sun Hongwei
 * @2020/3/15 下午2:42
 * File Description：抽象类
 */
public abstract class AbstractClass {
    public void templateMethod(){  // 模板方法
        SpecialMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void SpecialMethod(){
        System.out.println("抽象类的具体方法被调用");
    }

    public abstract void abstractMethod1();  //抽象方法1
    public abstract void abstractMethod2();  //抽象方法2
}
