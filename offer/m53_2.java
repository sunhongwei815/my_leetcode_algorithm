package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/28 上午2:10
 * File Description：0～n-1中缺失的数字: 一个长度为n-1的递增排序数组中的所有数字都是唯一的，
 * 并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 *
 * 二分查找，观察num[x]是否等于x，不等于的话，从右半边找，等于的话，从左半边找
 */
public class m53_2 {
    public int missingNumber(int[] nums) {
        int left=0,right=nums.length,mid;
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]!=mid){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
