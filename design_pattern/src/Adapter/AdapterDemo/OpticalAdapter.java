package Adapter.AdapterDemo;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午7:02
 * File Description：OpticalAdapter:光能适配器
 */
public class OpticalAdapter {
    //通过适配器类来创建motor类实例对象，并且调用motor类的方法
    private OpticalMotor omoter;
    public OpticalAdapter(){
        omoter=new OpticalMotor();
    }
    public void drive(){
        omoter.opticalDrive();
    }
}
