package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午8:05
 * File Description：在排序数组中查找元素的第一个和最后一个位置:
 *               给定一个按照升序排列的整数数组 nums，和一个目标值 target。
 *               找出给定目标值在数组中的开始位置和结束位置。
 *                  你的算法时间复杂度必须是 O(log n) 级别。
 *
 *
 * 二分查找改进：找到target后往前往后遍历（也可以再写个辅助函数继续二分查找）
 */
public class demo034 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[]{-1,-1};
        int l=0,r=nums.length-1,mid,p;
        while(l<r){
            mid=(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{

                //若是找到了等于target的数，分别往前往后遍历
                p=mid+1;
                while(p<nums.length && nums[p]==target)  p++;
                ans[1]=p-1;

                p=mid-1;
                while(p>=0 && nums[p]==target)  p--;
                ans[0]=p+1;
                break;
            }
        }
        return ans;
    }
}
