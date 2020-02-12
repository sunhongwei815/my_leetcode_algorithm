package demo101_200;

import java.util.HashSet;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:22
 * File Description：只出现一次的数字:  给定一个非空整数数组，除了某个元素只出现一次以外，
 *                        其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * hash表：如果出现第二次，删掉该数，所以最后遍历结果hashest里只会有一个数
 */
public class demo136 {
    public static int singleNumber(int[] nums) {
        HashSet set=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                set.remove(nums[i]);
            }
        }
        return (int)set.iterator().next();
    }

    public static void main(String[] args) {
        int[] x=new int[]{4,1,2,1,2,3,4,6,7,6,7};
        int result=singleNumber(x);
        System.out.println(result);
    }
}
