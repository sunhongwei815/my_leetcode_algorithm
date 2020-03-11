package Adapter;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午7:32
 * File Description：Adapter测试类
 */
public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("适配器模式测试开始：");
        Target target=new ClassAdapter();
        target.request();
    }
}
