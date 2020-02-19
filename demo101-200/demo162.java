package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/19 下午9:16
 * File Description：寻找峰值:峰值元素是指其值大于左右相邻值的元素。
 *             给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 *             用O(logN) 时间复杂度
 *
 *
 * 二分查找+递归
 */
public class demo162 {
    public int findPeakElement(int[] nums) {
        return search(nums,0,nums.length-1);
    }
    public int search(int[] nums,int left,int right){
        if(left==right) return left;
        int mid=(left+right)/2;
        if(nums[mid]>nums[mid+1]){ //mid可能存在于一个局部单减的区间，先去左半区间找
            return search(nums,left,mid);
        }
        return search(nums,mid+1,right);

    }
}
