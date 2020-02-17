package demo201_300;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author:Sun Hongwei
 * @2020/2/16 下午10:13
 * File Description：最长上升子序列:给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 *
 * 动态规划：状态转移方程
 */
public class demo300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int result=0;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    //状态转移方程：到某个点为止最大的长度是前面小于该数的某个位置长度+1
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                result=Math.max(result,dp[i]);
            }

        }
        return result;
    }
}
