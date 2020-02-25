package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午8:40
 * File Description：和为s的两个数字:输入一个递增排序的数组和一个数字s，在数组中查找两个数，
 *        使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 *
 *双指针，一前一后遍历
 */
public class m57_1 {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int[] ans=new int[2];
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{
                ans[0]=nums[i];
                ans[1]=nums[j];
                break;
            }
        }
        return ans;
    }
}
