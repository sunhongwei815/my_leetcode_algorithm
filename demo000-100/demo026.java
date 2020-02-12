package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午9:44
 * File Description： 删除排序数组中的重复项:  给定一个排序数组，你需要在原地删除重复出现的元素，
 *                     使得每个元素只出现一次，返回移除后数组的新长度。
 *
 *
 *   设置两个指针，一个用于遍历整个数组，一个用于保存新数组前n个不同的元素
 */
public class demo026 {
    public static int removeDuplicates(int[] nums) {
        int i=0,j=1;
        if(nums.length<=1){
            return nums.length;
        }else{
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    j++;
                }else{
                    nums[++i]=nums[j++];
                }
            }
        }
        return i+1;
    }
}
