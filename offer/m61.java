package offer;

import java.util.Arrays;

/**
 * @author:Sun Hongwei
 * @2020/2/25 下午6:52
 * File Description：扑克牌中的顺子:从扑克牌中随机抽5张牌，判断是不是一个顺子，
 * 即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，
 * 而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 *
 * 先排序，再统计0的个数，遍历过程中如果遇到不是连续的牌，判断是否能用0抵消
 */
public class m61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            //统计0的个数
            if(nums[i]==0){
                count++;
            }else if(i>0 && nums[i]-nums[i-1]>1 && nums[i-1]!=0) {
                if (nums[i]-nums[i-1]-1>count) { //如果0不够替代中间的差值，返回false
                    return false;
                }else {
                    count-=(nums[i]-nums[i-1]-1);
                }
            }else if(i>0 && nums[i]==nums[i-1]){ //如果遇到重复不为0的牌，直接返回false
                return false;
            }
        }
        return true;
    }
}
