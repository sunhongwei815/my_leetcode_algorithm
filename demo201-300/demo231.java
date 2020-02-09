/**
 * @author:Sun Hongwei
 * @2020/2/10 上午12:35
 * File Description：2的幂:给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 *   位运算！ x & (x-1):
 *    （1）如果x是2的幂，那么二进制为100000 ，结果为0
 *    （2）如果x不是2的幂，那么最高位一定还是1
 */
public class demo231 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (n & (n-1))==0;
    }
}
