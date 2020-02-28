package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午10:29
 * File Description：不用加减乘除做加法
 *
 *
 * 位运算
 */
public class m65 {
    public int add(int a, int b) {
        int sum=0;
        while(b!=0){
            sum=a^b;  //异或:表示求各位数字之和，不考虑进位
            b=(a&b)<<1; //与运算，再向右移一位，表示求进位
            a=sum;
        }
        return sum;
    }
}
