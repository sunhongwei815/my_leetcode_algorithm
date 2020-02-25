package offer;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午10:07
 * File Description：数组中数字出现的次数 II:在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。
 *               请找出那个只出现一次的数字。
 *
 *
 * 所有数转化成二进制按位相加，出现三次的数相加之和每位都是三的倍数，取余数后即为只出现一次的数
 */
public class m56_2 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++) {
            int count=0;  //count用于计算每一位的和
            for(int n:nums){
                if(((1<<i)&n)>0){  //取第i位的值
                    count++;
                }
            }
            if(count%3==1){
               ans+=(1<<i);
            }
        }
        return ans;
    }
}
