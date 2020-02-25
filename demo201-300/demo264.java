package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/26 上午12:21
 * File Description：丑数 II:编写一个程序，找出第 n 个丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 *
 *用三个指针，进行动态规划，分别比较指针所指的数的2，3，5倍，找出最小的数放入数组后，再更新
 */
public class demo264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0]=1;
        int a2=0,a3=0,a5=0,min;
        for(int i=1;i<n;i++){
           min=Math.min(dp[a2]*2,Math.min(dp[a3]*3,dp[a5]*5));
           if(min==dp[a2]*2) a2++;
           if(min==dp[a3]*3) a3++;
           if(min==dp[a5]*5) a5++;
           dp[i]=min;
        }
        return dp[n-1];
    }
}
