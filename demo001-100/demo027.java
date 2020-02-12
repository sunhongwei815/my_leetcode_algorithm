package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午9:50
 * File Description：移除元素:  给定一个数组nums和一个值val，
 *                          需要原地移除所有数值等于val的元素，返回移除后数组的新长度。
 *
 *
 * 双指针，一个从前往后，一个从后往前，从后往前遍历的指针依次找到不是val的元素，替换前面的val
 */
public class demo027 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[j]==val){
                j--;
            }else {
                if (nums[i] == val) {
                    nums[i] = nums[j--];
                }
                i++;
            }
        }
        return i;
    }
}
