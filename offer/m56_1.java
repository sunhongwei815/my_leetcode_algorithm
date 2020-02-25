package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午9:08
 * File Description：数组中数字出现的次数:一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
 *              请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 *
 *
 *   !异或处理：相同的数字异或后，结果为0，不相同的数字处理后，结果不为0
 *
 *   1. 先把所有数字异或处理，找出结果不为1的那一位
 *   2. 按照那一位是0或者是1，把结果分为两组（这样两个答案一定都在不同组）
 *   3. 对每一组单独异或处理，找到每组的那个数
 *
 */
public class m56_1 {
    public int[] singleNumbers(int[] nums) {
        int ans=0;
        int[] result=new int[2];
        for(int i:nums){
            ans=ans^i;
        }
        int lastOne = ans & -ans;  //求出结果是1的最后1位，其他位是0
        //将数组分为两组
        for(int i:nums){
            if((i&lastOne)==0){
                result[0]^=i;
            }else{
                result[1]^=i;
            }
        }
        return result;
    }
}
