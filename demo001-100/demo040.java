package demo001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Sun Hongwei
 * @2020/2/14 下午3:31
 * File Description：组合总和II:  给定一个数组 candidates 和一个目标数 target ，
 *                       找出 candidates 中所有可以使数字和为 target 的组合。
 *                       candidates 中的每个数字在每个组合中只能使用一次。
 *
 *
 *  回溯：重复的地方与前一个数先进行比较是否相同
 */
public class demo040 {
    List<List<Integer>> results=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  //排序，方便回溯时提前终止
        trackback(candidates,target,new ArrayList<Integer>(),0);
        return results;
    }

    public void trackback(int[] nums,int target,ArrayList<Integer> temp,int start){
        if(target==0){
            results.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;  //列表里加起来的值已经超过target

        for(int i=start;i<nums.length;i++){
            if(nums[i]>target) break;

            //遇到重复的数就不用加进去了
            if(i>start && nums[i]==nums[i-1]) continue;
            //回溯
            temp.add(nums[i]);
            trackback(nums,target-nums[i],temp,i+1);
            temp.remove(temp.size()-1);
        }

    }
}
