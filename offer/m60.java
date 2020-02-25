package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午7:23
 * File Description：n个骰子的点数：把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。
 * 输入n，打印出s的所有可能的值出现的概率。
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中
 * 第 i 小的那个的概率。
 *
 *
 * 动态规划：dp[i,s]:表示扔了i次后，出现s的概率
 * 边界条件：dp[1,s]=1, s=1,2,3,4,5,6
 * 状态转移方程：dp[i,s]=dp[i-1,s-1]+dp[i-1,s-2]+dp[i-1,s-3]+dp[i-1,s-4]
 *                     +dp[i-1,s-5]+dp[i-1,s-6]
 *
 */
public class m60 {
    public double[] twoSum(int n) {
        double[][] dp=new double[n+1][6*n+1];
        for(int i=1;i<=6;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=i;j<=i*6;j++){
                for(int d=1;d<=6;d++) {
                    if(j-d>=i-1){  //j-d<i-1时，dp[i-1][j-d]均为空值
                        dp[i][j]+=dp[i-1][j-d];
                    }
                }
            }
        }
        double total=Math.pow(6,n);
        double ans[]=new double[5*n+1];
        for(int i=n;i<=6*n;i++){
            ans[i-n]=dp[n][i]/total;
        }
        return ans;
    }
}
