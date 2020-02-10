/**
 * @author:Sun Hongwei
 * @2020/2/10 下午3:06
 * File Description：阶乘后的零:给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 数5的个数，以及5的幂的个数
 */
public class demo172 {
    public static int trailingZeroes(int n) {
        int count=0;
        while(n>=1){
            count+=n/5;  //分别统计含有多少5，25，125...
            n=n/5;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));
        System.out.println(trailingZeroes(25));
    }

}
