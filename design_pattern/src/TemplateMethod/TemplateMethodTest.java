package TemplateMethod;

/**
 * @author:Sun Hongwei
 * @2020/3/15 下午2:49
 * File Description：模板方法测试类
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass tm=new ConcreteClass();
        tm.templateMethod();
    }
}
