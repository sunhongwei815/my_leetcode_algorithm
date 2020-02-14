package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午10:39
 * File Description：乘积最大子序列:给定一个整数数组 nums ，
 *                      找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
 *
 *
 *  动态规划：d(p)=max(d（max）(p-1)*nums[p],nums[p])
 *         并且考虑负数情况 d(p)=max(d(min)(p-1)*nums[p],nums[p])
 *
 *     始终储存两个常量，最大值和最小值
 *
 */
public class demo152 {
    public int maxProduct(int[] nums) {
        int maxnum=Integer.MIN_VALUE;
        int imax=1,imin=1,temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){// 如果当前数是负数，那么乘上该数后当前最大值和最小值应该对调
                temp=imax;
                imax=imin;
                imin=temp;
            }
            // 更新最小值和最大值
            imax=Math.max(imax*nums[i],nums[i]);
            imin=Math.min(imin*nums[i],nums[i]);
            //System.out.println("max: "+imax+" min: "+imin);
            maxnum=Math.max(maxnum,imax);
        }
        return maxnum;
    }
}
