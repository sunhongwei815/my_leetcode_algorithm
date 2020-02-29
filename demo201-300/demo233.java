package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/29 下午4:50
 * File Description：数字 1 的个数:  给定一个整数n，计算所有小于等于n的非负整数中数字1出现的个数。
 *
 * 分别计算个，十，百，。。。上1的个数
 * 计算每一位上的1个数方法，分为两部分（以12345的百位为例）：
 *    （1） 先求除1000的商，表示有多少个1000（百位上1的个数以1000作为一次循环），并乘上100，代表1-12000中百位上1的个数
 *    （2） 求12001-12345中1的个数，取1000的模，减去100，再加1，此时这个数若超过100，则计入统计(统计12100-12199间的数)，否则不计入
 *
 */
public class demo233 {
    public int countDigitOne(int n) {
        long num=n;
        long count=0;
        for(long i=1;i<=num;i*=10){
            count+=(num/(i*10))*i+Math.min(Math.max(num%(i*10)-i+1,0),i);
        }
        return (int)count;
    }
}
