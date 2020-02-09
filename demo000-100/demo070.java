import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author:Sun Hongwei
 * @2020/2/9 下午10:16
 * File Description：爬楼梯：假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 动态规划：d[p]=d[p-1]+d[p-2]
 */
public class demo070 {
    public static int climbStairs(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        int[] dp=new int[n];
        dp[0]=1;dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

}
