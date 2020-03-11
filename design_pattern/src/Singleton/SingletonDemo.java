package Singleton;

import sun.jvm.hotspot.tools.SysPropsDumper;

import java.sql.SQLOutput;

/**
 * @author:Sun Hongwei
 * @2020/3/11 下午2:22
 * File Description：只能创建一个SHW
 */
public class SingletonDemo {
    public static class Sunhongwei{
        private  static volatile Sunhongwei instance=null;

        private Sunhongwei() {
            System.out.println("生产一个Sun Hongwei");
        }

        public static synchronized Sunhongwei getInstance(){
            //同步
            if(instance==null){
                instance=new Sunhongwei();
            }else{
                System.out.println("已经有Sun Hongwei了，不能再生产了");
            }
            return instance;
        }

        public void getName(){
            System.out.println("我是 Sun Hongwei!!!");
        }
    }
    public static void main(String[] args) {
        Sunhongwei shw1=Sunhongwei.getInstance();
        shw1.getName();
        Sunhongwei shw2=Sunhongwei.getInstance();
        shw2.getName();

        //判断是否是同一个对象
        if(shw1==shw2){
            System.out.println("他们是同一个Sun Hongwei");
        }else {
            System.out.println("他们不是用一个Sun Hongwei!!!");
        }
    }

}


