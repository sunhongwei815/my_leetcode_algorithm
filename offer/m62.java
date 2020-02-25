package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午6:01
 * File Description：圆圈中最后剩下的数字:0,1,...,n-1这n个数字排成一个圆圈，
 *          从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 *
 *
 */
public class m62 {
    public int lastRemaining(int n, int m) {
        if(n<1 || m<1){
            return -1;
        }
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=(ans+m)%i;
        }
        return ans;
    }
}
