package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午11:10
 * File Description：完全平方数:给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）
 *                  使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 *
 *  动态规划：首先最差情况，n全由1组成 dp(i)=i
 *     状态转移方程 dp(i)=min(dp(i),dp(i-k*k）+1)；
 */
public class demo279 {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);  //状态转移方程
            }
        }
        return dp[n];
    }
}
