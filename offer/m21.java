package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/27 下午7:28
 * File Description：调整数组顺序使奇数位于偶数前面: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *         使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 *
 * 双指针，一前一后遍历，交换顺序
 */
public class m21 {
    public int[] exchange(int[] nums) {
        int left=0,right=nums.length-1,temp;
        while(left<right){
            while(left<nums.length && nums[left]%2==1){
                left++;
            }
            while(right>=0 && nums[right]%2==0){
                right--;
            }
            if(left>right) break;
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }
        return nums;
    }
}
