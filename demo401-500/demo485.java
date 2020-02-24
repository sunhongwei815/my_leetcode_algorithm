package demo401_500;

/**
 * @author:Sun Hongwei
 * @2020/2/24 下午4:52
 * File Description：最大连续1的个数:给定一个二进制数组， 计算其中最大连续1的个数。
 *
 *
 * 遍历统计即可
 */
public class demo485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for (int n:nums){
            if(n==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
        }
        return max;
    }
}
