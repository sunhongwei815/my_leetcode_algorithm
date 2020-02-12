package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:39
 * File Description：两数之和:给定一个整数数组 nums 和一个目标值 target，
 *                请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 *
 *  1.暴力遍历即可
 *  2.两边遍历hash表，第一遍将target-nums[i]放入hash表，第二遍监察nums[i]是否在表里
 */
public class demo001 {
    public int[] twoSum(int[] nums, int target) {
        int[] out=new int[2];
        for(int i=0;i<nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    return out;
                }
            }
        }
        return null;
    }
}
