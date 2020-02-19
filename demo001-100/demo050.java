package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午1:30
 * File Description：Pow(x, n):实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 *
 *
 * 尽可能的减少运算次数：比如x^5:  (x^2)^2 *  x
 * 考虑用递归实现这一过程
 */
public class demo050 {
    public double myPow(double x, int n) {
        switch (n){
            case 0:
                return 1;
            case 1:
                return x;
            case -1:
                return 1/x;
        }
        double half,rest;

        half=myPow(x,n/2);
        rest=myPow(x,n%2);
        return half*half*rest;

    }
}
