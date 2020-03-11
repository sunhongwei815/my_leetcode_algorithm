package Adapter;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午7:31
 * File Description：适配器类
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request(){
        specificRequest();
    }
}
