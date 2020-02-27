package demo501_600;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午10:41
 * File Description：斐波那契数: 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。
 *        该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 *
 *  用递归的话可以解决，但时间复杂度过高，直接用三数互相替代，累加节约时间
 */
public class demo509 {
    public int fib(int N) {
        if(N==0) return 0;
        if(N==1) return 1;
        int a1=0,a2=1,a=1;
        for(int i=2;i<=N;i++){
            a=a1+a2;
            a1=a2;
            a2=a;
        }
        return a;
    }
}
