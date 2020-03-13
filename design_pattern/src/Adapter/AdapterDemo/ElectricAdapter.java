package Adapter.AdapterDemo;

/**
 * @author:Sun Hongwei
 * @2020/3/13 下午6:58
 * File Description：电能适配器，引入Motor接口
 */
public class ElectricAdapter implements Motor{
    // 适配器内创建ElectricMotor实例对象
    private ElectricMotor emoter;
    public ElectricAdapter(){
        emoter=new ElectricMotor();
    }

    public void drive(){
        emoter.electricDrive();
    }
}
