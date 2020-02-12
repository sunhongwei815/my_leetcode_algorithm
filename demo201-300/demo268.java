package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午4:09
 * File Description：缺失数字:给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，
 *                       找出 0 .. n 中没有出现在序列中的那个数。
 *
 *
 * 将0~n都加起来，减去数组之和，就是所缺失的数字
 */
public class demo268 {
    //找缺失值
    public static int missingNumber(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        return (nums.length+1)*nums.length/2-sum;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{9,6,4,2,3,5,7,0,1};
        int x=missingNumber(nums);
        System.out.println(x);
    }
}
