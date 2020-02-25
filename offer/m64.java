package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午5:47
 * File Description： 求1+2+…+n:求 1+2+...+n ，
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 *
 *
 * 递归
 */
public class m64 {
    public int sumNums(int n) {
        return n==1?1:sumNums(n-1)+n;
    }
}
