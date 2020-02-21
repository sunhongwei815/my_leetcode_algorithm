package demo501_600;

/**
 * @author:Sun Hongwei
 * @2020/2/21 下午9:55
 * File Description：最短无序连续子数组: 给定一个整数数组，你需要寻找一个连续的子数组，
 *                    如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 *                     你找到的子数组应是最短的，请输出它的长度。
 *
 *
 *
 * 无序子数组中: 最小元素的实际正确位置决定了左边界，最大元素的实际正确位置决定了右边界
 *
 * 先正向遍历找到最小的降序序列中最小的数min,再逆向找到最大的数max
 * 并找到min,max应该所处的位置即可。
 */
public class demo581 {
    public int findUnsortedSubarray(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                min=Math.min(min,nums[i]);
                max=Math.max(max,nums[i-1]);
            }
        }
        int left,right;
        for(left=0;left<nums.length;left++){
            if(min<nums[left]){
                break;
            }
        }
        for(right=nums.length-1;right>=0;right--){
            if(max>nums[right]){
                break;
            }
        }
        return right<left?0:right-left+1;
    }
}
