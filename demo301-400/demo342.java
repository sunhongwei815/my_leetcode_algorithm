/**
 * @author:Sun Hongwei
 * @2020/2/10 上午12:42
 * File Description：4的幂:给定一个整数，编写一个函数来判断它是否是 4 的幂次方。
 *
 * 位运算！（1）  x & (x-1):先保证是2的幂
 *        （2）4的幂和（101010...1010）进行与计算^:结果一定是0，并且是2的幂而不是4的幂的数结果一定不为0
 */
public class demo342 {
    public static boolean isPowerOfFour(int num) {
        System.out.println(((num^(num-1))));
        return (num>0) && ((num&(num-1))==0) && ((num&0xaaaaaaaa)==0);
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfFour(n));
    }
}
