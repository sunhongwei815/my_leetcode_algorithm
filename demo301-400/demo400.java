package demo301_400;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午11:28
 * File Description：第N个数字：在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
 *                            ...中找到第 n 个数字。
 *
 * 1.先找出n所处的区间段，0-9，10-99，100-999.。。。。。
 * 2.求出n所在的那个数具体是多少：
 * （1）如果是某个数字的个位数字，直接mod10就好了
 * (2) 如果不是各位数字，先用digits-rest求出这个数字还有多少位（假设后面还有m位），
 *     除以10^m后，再mod10即可
 */
public class demo400 {
    public int findNthDigit(int n) {
        long num=n;
        int ans=0;
        if(num==0) return ans;
        long digits=1; //n所在的位数
        long i=1;//当前位数
        while(num>digits*(9*i)){
            num=num-digits*(9*i);  //i:位数  9*i: 该位数的数字有多少个
            digits++;
            i=i*10;
        }
        long count=num/digits;
        long rest=num%digits;

        if(rest==0){  //某个数字的末位
            ans=(int)(((long)Math.pow(10,digits-1)+count-1)%10);
        }else{
            long number=(long)Math.pow(10,digits-1)+count;
            ans=(int)(number/(long)Math.pow(10,digits-rest))%10;
        }
        return ans;

    }
}
