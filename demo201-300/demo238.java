/**
 * @author:Sun Hongwei
 * @2020/2/9 下午8:10
 * File Description：给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，
 * 其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 * 除自身外数组的乘积(不能用乘法，时间O（n))
 */
public class demo238 {
    public static int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] left=new int[len]; //从左数所有数的乘积
        int[] right=new int[len]; //从右数所有数的乘积
        right[len-1]=nums[len-1];left[0]=nums[0];
        int[] result=new int[len]; //最后的结果
        for(int i=len-2;i>=0;i--){
            right[i]=nums[i]*right[i+1];
        }
        for(int i=1;i<len-1;i++){
            left[i]=nums[i]*left[i-1];
            result[i]=left[i-1]*right[i+1]; //每个结果等于左边所有数和右边所有数的乘积
        }
        result[0]=right[1];
        result[len-1]=left[len-2];
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] tt = demo238.productExceptSelf(nums);
        for (int i : tt) {
            System.out.println(i);
        }
    }
}
