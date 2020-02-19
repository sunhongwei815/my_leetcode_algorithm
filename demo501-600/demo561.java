package demo501_600;

import java.util.Arrays;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午10:31
 * File Description：数组拆分 I:   给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
 *       例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 *
 *
 * 先排序，再取第1，3，5，...的数之和
 */
public class demo561 {
    public int arrayPairSum(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            ans+=nums[i];
        }
        return ans;
    }
}
