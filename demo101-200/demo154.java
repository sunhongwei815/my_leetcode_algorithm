package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/28 下午6:42
 * File Description：寻找旋转排序数组中的最小值 II:：假设按照升序排序的数组在预先未知
 *   的某个点上进行了旋转。( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *   请找出其中最小的元素。注意数组中可能存在重复的元素。
 *
 * 二分查找，用nums[right]和nums[mid]进行比较，判断哪半边是有序的，进而找出最小值
 *
 */
public class demo154 {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1,mid;
        while(left<right){
            mid=(left+right)/2;
            if(nums[mid]<nums[right]){ //右半边有序，最小数在左边
                right=mid;
            }else if(nums[mid]>nums[right]){ //右半边无序，最小数在右边
                left=mid+1;
            }else{ //遇到有重复的情况
                right=right-1;  //right向左移一位继续比较
            }
        }
        return nums[left];
    }
}
