package Adapter.AdapterDemo;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午7:06
 * File Description：Adapter测试类
 */
public class MotorAdapterTest {
    public static void main(String[] args) {
        System.out.println("适配者模式调用： ");
        OpticalAdapter opticalAdapter=new OpticalAdapter();
        opticalAdapter.drive();
    }
}
