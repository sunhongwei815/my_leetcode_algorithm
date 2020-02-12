package demo101_200;

/**
 * @author:Sun Hongwei
 * @2020/2/12 下午3:03
 * File Description：多数元素:给定一个大小为 n 的数组，找到其中的多数元素。
 *                          多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *                          可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *
 * 往后遍历，假定某个数是answer,如果出现+1，否则-1，如果到某个地方>=0时更新 多数元素
 */
public class demo169 {
    public static int majorityElement(int[] nums) {
        int count=0;
        Integer x=null;
        for(int num:nums){
            if(count==0) x=num;  //换个数
            count+=(num==x)?1:-1;
        }
        return x;
    }


    public static void main(String[] args) {
        int[] x=new int[]{2,2,1,1,1,2,2};
        int result=majorityElement(x);
        System.out.println(result);
    }
}
