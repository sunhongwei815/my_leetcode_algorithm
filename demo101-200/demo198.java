package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:10
 * File Description：打家劫舍：从数组中选取不相邻的数，问能取到的最大值
 *
 * 动态规划：
 * 转移公式：f(k) = max(f(k – 2) + A(k),f(k – 1))
 */
public class demo198 {
    public static int rob(int[] nums){
        if(nums.length<1) return 0;
        if(nums.length==1) return nums[0];
        int[] maxsum=new int[nums.length];
        maxsum[0]=nums[0];
        maxsum[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            //到某个位置的最大值是（1）要么不取该数，取前一个（2）要么取该数，不取前一个，
            //并加上f(i-2)的最大值
            maxsum[i]=Math.max(maxsum[i-1],maxsum[i-2]+nums[i]);
        }
        return maxsum[nums.length-1];
    }

    public static void main(String[] args) {
        int[] n=new int[]{2,1,1,2};
        System.out.println(rob(n));
    }
}
