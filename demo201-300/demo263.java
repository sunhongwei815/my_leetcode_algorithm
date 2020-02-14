package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午11:20
 * File Description：丑数:  编写一个程序判断给定的数是否为丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 直接除到1为止
 */
public class demo263 {
    public boolean isUgly(int num) {
        if(num<1) return false;
        while (num!=1){
            if(num%2!=0 && num%3!=0 && num%5!=0){
                return false;
            }else if(num%2==0){
                num/=2;
            }else if(num%3==0){
                num/=3;
            }else{
                num/=5;
            }
        }
        return true;
    }
}
