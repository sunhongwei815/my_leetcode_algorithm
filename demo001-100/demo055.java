package demo001_100;

/**
 * @author:Sun Hongwei
 * @2020/2/16 下午9:36
 * File Description：跳跃游戏: 给定一个非负整数数组，你最初位于数组的第一个位置。
 *                          数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *                          判断是否能够到达最后一个位置。
 *
 *
 *
 *  从后往前遍历，判断是否能跳到该点,设置一个变量pos保存能保证到终点的最后一个节点位置
 *
 */
public class demo055 {
    public boolean canJump(int[] nums) {
        int pos=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=pos){
                pos=i;
            }
        }
        return  pos==0;
    }
}
