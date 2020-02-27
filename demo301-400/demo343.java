package demo301_400;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午11:00
 * File Description：整数拆分:给定一个正整数 n，将其拆分为至少两个正整数的和，
 *              并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 1.若n<4时，单独考虑
 * 2.若n>4,尽可能多拆成3
 *      （1） 若正好是3的倍数，结束
 *      （2） 若余数还剩1的话，1+3=2+2，换成两个2
 *      （3） 若余数还剩2的话，直接再乘2
 *
 */
public class demo343 {
    public int integerBreak(int n) {
        int ans=n-1,count=n/3;
        if(n<=3) return ans; //2和3的时候单独考虑
        if(n%3==0){
            ans=(int)Math.pow(3,count);
        }else if(n%3==1){
            ans=(int)Math.pow(3,count-1)*4;
        }else{
            ans=(int)Math.pow(3,count)*2;
        }
        return ans;
    }
}
