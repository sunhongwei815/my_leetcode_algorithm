package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午10:29
 * File Description：旋转数组:  给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
 *
 *
 * 反转三次即可：1.  从第1~n-k个数反转
 *            2.   从第（n-k+1)~n个数反转
 *            3.   从第1~n个数反转
 */
public class demo189 {
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;  //防止k比nums.length要大
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

}
