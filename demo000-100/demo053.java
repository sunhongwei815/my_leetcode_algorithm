/**
 * @author:Sun Hongwei
 * @2020/2/12 下午2:36
 * File Description：最大子序和:给定一个整数数组nums,找到一个具有最大和的连续子数组
 *                   （子数组最少包含一个元素），返回其最大和。
 *  Kadane 算法:向右遍历
 *  （1）如果前面的sum大于0，结果有增益，直接加上
 *  （2）如果前面的sum小于0，结果无增益，舍去
 *   (3)每次比较更新当前最大值
 *
 */
public class demo053 {
    //最大自序和：动态规划
    public static int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=(nums[i-1]>0)?nums[i-1]:0; //判断当前的前面自序之和
            maxsum=(nums[i]>maxsum)?nums[i]:maxsum; //更新最大值
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-2,-1};
        int x=maxSubArray(nums);
        System.out.println(x);
    }
}
