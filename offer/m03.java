package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午4:51
 * File Description：数组中重复的数字：在一个长度为 n 的数组 nums 里的所有数字都在
 * 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 *
 * 如果没有重复数字，那么正常排序后，数字i应该在下标为i的位置，所以思路是重头扫描数组，
 * 遇到下标为i的数字如果不是i的话，（假设为m),那么我们就拿与下标m的数字交换。
 * 在交换过程中，如果有重复的数字发生，那么终止返回ture
 *
 */
public class m03 {
    public int findRepeatNumber(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }
}
