package demo201_300;

/**
 * @author:Sun Hongwei
 * @2020/2/10 下午2:57
 * File Description：寻找重复数:给定一个包含 n + 1 个整数的数组 nums，
 * 其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设只有一个重复的整数，找出这个重复的数。
 *
 * 双指针（快慢指针）key->value->key在有重复整数的数组里必然存在一个循环
 *
 */
public class demo287 {

    public int findDuplicate(int[] nums) {
        if(nums.length<=1) return -1;
        int slow=nums[0],fast=nums[0];  //定义快慢指针
        do{  //分别设置两个快慢指针，直到两者相遇
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        //再从头开始设置一个指针，与重复的指针值相等时，则返回那个重复的数
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;

    }
}
