/**
 * @author:Sun Hongwei
 * @2020/2/11 下午6:09
 * File Description：x 的平方根:实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 *
 * 牛顿迭代法：X(n+1)=(1/2)*(X(n)+x/X(n))
 *   最后收敛结果为x的平方根
 */
public class demo069 {
    public int mySqrt(int x) {
        double x0=x,x1=(x0+x/x0)/2.0;
        while (Math.abs(x1-x0)>=1){  //前后两数相差小于1表示收敛
            x0=x1;
            x1=(x0+x/x0)/2.0;
        }
        return (int)x1;
    }
}
