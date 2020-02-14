package demo301_400;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午9:48
 * File Description：比特位计数:给定一个非负整数 num。
 *       对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 *
 * 位计算 + 动态规划：
 *    f(x)=f(x/2)+(x mod 2)
 *
 */
public class demo338 {
    public int[] countBits(int num) {
        int[] res=new int[num+1];
        for(int i=1;i<=num;i++){
            res[i]=res[i>>1]+(i & 1);
            //a & 1:判断末位数字是0或1
        }
        return res;
    }

}
